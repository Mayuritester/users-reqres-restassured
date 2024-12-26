package in.reqres.usersinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class GetListUser extends TestBase {

    @Test
    public void verifyListUser(){
        Response response = given()
                .queryParam("page",2)
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
    }
  @Test
    public void verifyPerPageSix(){
        Response response = given()
                .pathParam("per_page",6)
                .when()
                .get("/{per_page}");
        response.prettyPrint();
        response.then().statusCode(200);
  }

  @Test
    public void verifyDataAndId(){
      Map<String, Object> qParams = new HashMap<>();
      qParams.put("page 2","data");
      qParams.put("id","8");
        Response response = given()
                .params(qParams)
                .when()
                .get("/users");
        response.prettyPrint();
        response.then().statusCode(200);
  }

  @Test
  public void verifyTheSingleUser(){
        Response response = given()
                .pathParam("id","8")
                .when()
                .get("/users/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
        }
  }

//  @Test
//    public void verifyFirstName(){
//        Map<String,Object> qParams = new HashMap<>();
//        qParams.put("page 2","data");
//        qParams.put("first_name","Byron");
//        Response response = given()
//                .params(qParams)
//                .when()
//                .get("/users");
//        response.prettyPrint();
//        response.then().statusCode(200);
//    }


