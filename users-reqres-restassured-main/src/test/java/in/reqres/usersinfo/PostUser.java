package in.reqres.usersinfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import in.reqres.utils.TestUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostUser extends TestBase {


    @Test
    public void postCreateUsers(){
    String email = TestUtils.getRandomValue() + "Mayuri23@mayuri.com";

        UserPojo userPojo = new UserPojo();
        userPojo.setFirstName("Mayuri");
        userPojo.setLastName("Patel");
        userPojo.setEmail(email);
        userPojo.setAvatar("https://reqres.in/img/faces/8-image.jpg");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .when()
                .body(userPojo)
                .post();
        response.prettyPrint();
        response.then().statusCode(201);
    }
    @Test
    public void loginSuccessFully(){
        Response response = given().log().all()
                .header("Content-Type","application/json")
                .when()
                .body("{ \"email\": \"TMayuri.12@gmail.com\", \"password\": \"tester\" }")
                .post("/api/login");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}
