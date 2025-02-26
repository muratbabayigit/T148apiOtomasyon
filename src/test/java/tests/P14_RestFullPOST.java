package tests;

import baseUrl.RESTFULL_baseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class P14_RestFullPOST extends RESTFULL_baseUrl {
       /*
            https://restful-booker.herokuapp.com/booking endpointine
            asagidaki body’ye sahip bir POST request gonderdigimizde donen response’un
            status code’unun 200 oldugunu ve “firstname” degerinin “Murat” oldugunu test edin
{
     "firstname" : “Murat”,
     “lastname” : “Yiğit”,
     “totalprice” : 500,
     “depositpaid” : false,
     “bookingdates” : {
              "checkin": "2021-06-01",
              "checkout" : “2021-06-10”
                       },
     “additionalneeds” : “wi-fi”
  }
     */

    @Test
    public void test(){
        specRestFull.pathParam("pp1","booking");
        JSONObject bookingdates=new JSONObject();
        bookingdates.put( "checkin", "2021-06-01");
        bookingdates.put( "checkout", "2021-06-10");

        JSONObject reqBody=new JSONObject();
        reqBody.put("firstname","Murat");
        reqBody.put("lastname","Yiğit");
        reqBody.put("totalprice",500);
        reqBody.put("depositpaid",false);
        reqBody.put("bookingdates",bookingdates);
        reqBody.put("additionalneeds","wi-fi");


        Response response=given().contentType(ContentType.JSON)
                                 .spec(specRestFull).when()
                                 .body(reqBody.toString()).post("/{pp1}");
 /*
        silme:  DELETE
        update: PUT - PATCH(parçalı)
        yeni kayıt: POST
        görüntüleme: GET
  */

      response.then().assertThat().statusCode(200).body("booking.firstname", equalTo("Murat"),
              "booking.lastname",equalTo("Yiğit"),"booking.totalprice",equalTo(500),
              "booking.depositpaid",equalTo(false),"booking.bookingdates.checkin",equalTo("2021-06-01"),
              "booking.bookingdates.checkout",equalTo("2021-06-10"),
              "booking.additionalneeds",equalTo("wi-fi"));

    }


    /*
     https://restful-booker.herokuapp.com/booking endpointine
            asagidaki body’ye sahip bir POST request gonderdigimizde
{
     "firstname" : “Murat”,
     “lastname” : “Yiğit”,
     “totalprice” : 500,
     “depositpaid” : false,
     “bookingdates” : {
              "checkin": "2021-06-01",
              "checkout" : “2021-06-10”
                       },
     “additionalneeds” : “wi-fi”
            {

     donen response’unstatus code’unun 200 oldugunu ve sonucun bookingid hariç
     aşşağıdaki gibi olduğunu test edin

    "bookingid": 1063,
    "booking": {
        "firstname": "Murat",
        "lastname": "Yiğit",
        "totalprice": 500,
        "depositpaid": false,
        "bookingdates": {
            "checkin": "2021-06-01",
            "checkout": "2021-06-10"
        },
        "additionalneeds": "wi-fi"
    }
}

     */

}
