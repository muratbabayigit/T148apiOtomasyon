package tests;

import groovy.json.JsonParser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class P09_GET_expectedDataOlusturma {
    /*

        https://jsonplaceholder.typicode.com/posts/22 url’ine
        bir GET request yolladigimizda donen response body’sinin
         asagida verilen ile ayni oldugunu test ediniz

  Response body :(EXPECTED DATA)
{
    “userId”: 3,
    “id”: 22,
    “title”: "dolor sint quo a velit explicabo quia nam",
    “body”: "eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear
            um mollitia molestiae aut atque rem suscipit\nnam impedit esse"
}

 */

    @Test
    public void test(){
        //1-Endpoint
        String url=" https://jsonplaceholder.typicode.com/posts/22";

        //2-Expected Data Oluşturulur
        JSONObject expBody=new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","eos qui et ipsum ipsam suscipit aut\n" +
                "sed omnis non odio\n" +
                "expedita earum mollitia molestiae aut atque rem suscipit\n" +
                "nam impedit esse");

        //3-Response
        Response response=given().when().get(url);

        //Expected Data hazırlanmışsa bu verilerle dönen cevabı karşılaştırmak istersek
        //Dönen cevabında JsonPath şeklinde ulaşılabilir olması lazım.
        JsonPath respJP=response.jsonPath();


        //assertEquals(expBody.get("userId"),response.get("userId"));

        assertEquals(expBody.get("userId"),respJP.get("userId"));
        Assertions.assertEquals(expBody.get("id"),respJP.get("id"));
        assertEquals(expBody.get("title"),respJP.get("title"));
        assertEquals(expBody.get("body"),respJP.get("body"));

    }
}
