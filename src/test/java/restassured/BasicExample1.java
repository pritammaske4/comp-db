package restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

public class BasicExample1 {
    public static void main(String[] args) {

        //Base URI Declaration
        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";

        //RS Reference Variable Creation
        RequestSpecification requestSpecification = RestAssured.given();

        //Request call and response acceptance
        Response response = requestSpecification.get("/employees");

        //Verification
         boolean result =response.asString().contains("\"id\":\"ABCS\"");
        System.out.println("Result : "+result);
        List list= response.body().jsonPath().get("id");





    }
}
