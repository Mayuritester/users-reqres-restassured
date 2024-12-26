package in.reqres.usersinfo;

import in.reqres.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UserDelete extends TestBase {

    @Test
    public void deleteTheID(){
        given().log().all()
                .pathParam("id","6")
                .when()
                .delete("/{id}")
                .then().log().all()
                .statusCode(204);
    }
}
