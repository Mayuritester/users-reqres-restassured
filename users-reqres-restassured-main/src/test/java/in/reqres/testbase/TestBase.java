package in.reqres.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {

    @BeforeClass
    public  void inInt(){
        RestAssured.baseURI = "https://reqres.in";
       // RestAssured.port = 8080;
        RestAssured.basePath = "/api";
    }

}