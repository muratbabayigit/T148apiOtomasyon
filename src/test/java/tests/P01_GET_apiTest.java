package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class P01_GET_apiTest {

    /*
    https://restful-booker.herokuapp.com/booking/10 url’ine
    bir GET request gonderdigimizde donen Response’un,
 	status code’unun 200,
	ve content type’inin application/json; charset=utf-8,
	ve Server isimli Header’in degerinin Cowboy,
	ve status Line’in HTTP/1.1 200 OK
	ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.

     */

 /*
    Tüm API sorguları 4 aşamada yapılır
        1-EndPonit hazırlanır(url ve varsa(PUT-POST-PATCH) request Body hazırlanır)
        2-Soruda verilmiş ise Expected Data hazırlanır. Verilmemişse hazırlanmaz
        3-Dönen cevap kaydedilir
        4-Assertion işlemleri yapılır

  */



    @Test
    public void test(){
        //1-EndPonit hazırlanır
        String url="https://restful-booker.herokuapp.com/booking/10";

        // 2-Soruda verilmiş ise Expected Data hazırlanır. Verilmemişse hazırlanmaz
        //Soruda verilmemiş

        //3-Dönen cevap kaydedilir
        Response response=given().when().get(url); //RestAssured.get(url);

        //response.prettyPeek();

        //4-Assertion İşlemleri yapılır

        System.out.println("Status Değeri: "+response.getStatusCode()); //200
        System.out.println("Content Type Değeri: "+response.getContentType()); //application/json; charset=utf-8
        System.out.println("Server isismli Header Değeri: "+response.getHeader("Server")); // Cowboy
        System.out.println("Status Line Değeri: "+response.getStatusLine()); // HTTP/1.1 200 OK
        System.out.println("Response Süresi Değeri: "+response.getTime()); // 5 saniyeden kısa




    }
}
