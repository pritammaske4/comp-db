package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicExample3 {
    public static void main(String[] args) {
        Response response = RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/delhi");
        int statusCode =  response.getStatusCode();
        String s = response.getStatusLine();
        System.out.println("Status Line : "+s);
        System.out.println( "Status Code Is : "+statusCode);
        System.out.println("temp :"+response.body().jsonPath().get("Temperature"));
    }
}


class _Pritam1{
    public static void main(String[] args) {
        System.out.println("Hello");
    }
        }