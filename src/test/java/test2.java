//import org.testng.Assert;
//import org.testng.annotations.Test;
//
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
public class test2 {
    @Test
    public void testPostsAPI() {
        // Base URI
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/posts";

        // Call the API
        Response response = given()
                .when()
                .get("/posts")
                .then()
                .extract()
                .response();

        // Assert status code is 200
        Assert.assertEquals(response.getStatusCode(), 200, "Expected status code 200.");

        // Extract the response as a list of maps
        List<Map<String, Object>> posts = response.jsonPath().getList("$");

        // Validate the title of post with ID 17
        Map<String, Object> post17 = posts.stream()
                .filter(post -> post.get("id").equals(17))
                .findFirst()
                .orElse(null);
        Assert.assertNotNull(post17, "Post with ID 17 not found.");
        Assert.assertEquals(post17.get("title"), "fugit voluptas sed molestias voluptatem provident",
                "Title does not match for ID 17.");

        // Validate each object has non-empty keys
        for (Map<String, Object> post : posts) {
            Assert.assertTrue(post.containsKey("userId") && post.get("userId") != null && !post.get("userId").toString().isEmpty(),
                    "UserId is missing or empty.");
            Assert.assertTrue(post.containsKey("id") && post.get("id") != null && !post.get("id").toString().isEmpty(),
                    "ID is missing or empty.");
            Assert.assertTrue(post.containsKey("title") && post.get("title") != null && !post.get("title").toString().isEmpty(),
                    "Title is missing or empty.");
            Assert.assertTrue(post.containsKey("body") && post.get("body") != null && !post.get("body").toString().isEmpty(),
                    "Body is missing or empty.");
        }
    }
}

//    @Test(groups = "regression")
//    public void e() {
//        String expectedResult = "User";
//        String actualResult = Name.checkName("L.ith");
//        Assert.assertEquals(actualResult, expectedResult);
//
////        System.out.println(actualResult);
//
//    }
//}
