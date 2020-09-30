import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_DELETE {
	@Test
	public void test_4_delete() {
	
	
	when().
	       delete("https://reqres.in/api/users/2").
	then().
	       statusCode(204).
	       log().all();

}
}