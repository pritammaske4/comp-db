package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicExample2 {
    public static void main(String[] args) {
        RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";

        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.get("/pune");

        System.out.println(response.body().asString());
        System.out.println("Temp : "+response.body().jsonPath().get("Temperature"));
    }
}
