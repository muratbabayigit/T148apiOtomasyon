package testDatas;

import org.json.JSONObject;

import java.util.Scanner;

public class JPHDatas {
    public static int basariliStatusCode=200;


    public static JSONObject expDataOlustur(){
        JSONObject expBody=new JSONObject();
        expBody.put("userId",3);
        expBody.put("id",22);
        expBody.put("title","dolor sint quo a velit explicabo quia nam");
        expBody.put("body","os qui et ipsum ipsam suscipit aut\\nsed omnis non odio" +
                "\\nexpedita earum mollitia molestiae aut atque rem suscipit" +
                "\\nnam impedit esse");



        return expBody;
    }

    public static JSONObject expDataOlusturParametreli(int userId,int id,String title,String body){

        JSONObject expBody=new JSONObject();
        expBody.put("userId",userId);
        expBody.put("id",id);
        expBody.put("title",title);
        expBody.put("body",body);

        return expBody;

    }
     public static JSONObject expDataOlusturScanner(){
         Scanner scanner=new Scanner(System.in);
         System.out.println("Gerekli Bilgileri Giriniz!");
         System.out.print("userId: ");
         int userId=scanner.nextInt();
         System.out.print("id: ");
         int id=scanner.nextInt();
         System.out.print("title: ");
         String title=scanner.nextLine();
         System.out.print("body: ");
         String body=scanner.nextLine();


         JSONObject expBody=new JSONObject();
         expBody.put("userId",userId);
         expBody.put("id",id);
         expBody.put("title",title);
         expBody.put("body",body);

         return expBody;

     }
}
