import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashSet;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TEst {

    @Test
    public void test() {
    }
}


//
//
//
//
//
//
//
//
////      given().relaxedHTTPSValidation() // <-- Add this line
////                .baseUri("https://67311fb67aaf2a9aff0fe45e.mockapi.io/api/v1").log().ifValidationFails()
////                .when().get("/api/v1/users")
////              .then().log().ifValidationFails()
////              .body("[0].name",equalTo("Mela Bode"));
////
//////              .then().log().ifError();
//////                .then().extract().response().path("[0].name");
////
//////String name =        JsonPath.from(res.asString()).getString("[0].name");
////
////
//////      String name = res.path("[0].name");
//////System.out.println(name);
////
//////                .assertThat().statusCode(200)
//////                .assertThat().body("[0].name",is(equalTo("Melanie Bode")))
//////                .assertThat().body( "name",hasItem("Leticia Gutkowski"))
////                //.assertThat().body("name", not(hasItem("Marty Barton")))
//////                .assertThat().body("name", contains("Melanie Bode","Shawna Collins DDS"));
//////                .assertThat().body("name", not(empty()));
//////                .assertThat().body("name", hasSize(4));
//////                .assertThat().body("name.size()", equalTo(5));
//////                .assertThat().body("createdAt", everyItem(startsWith("2024")));
//////                .assertThat().body("[0]", hasEntry("name","Shawna Collins DDS"));
