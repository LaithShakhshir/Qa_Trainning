import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import java.util.Map;

import static io.restassured.RestAssured.given;


public class test1 {

    @Test
    public void testUsersAPI() {
        // Base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/users ";

        // Call the API
        Response response = given()
                .when()
                .get("/users")
                .then()
                .extract()
                .response();

        // Assert status code is 200
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200.");

        // Extract the response as a list of maps
        List<Map<String, Object>> users = response.jsonPath().getList("$");

        // Count the number of IDs
        int idCount = users.size();
        System.out.println("Number of IDs: " + idCount);

        // Print each ID with the relative name
        for (Map<String, Object> user : users) {
            System.out.println("ID: " + user.get("id") + ", Name: " + user.get("name"));
        }
    }


}
