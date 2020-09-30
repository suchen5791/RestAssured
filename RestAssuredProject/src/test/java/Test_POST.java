import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_POST {
		
	@Test
		public void test_1_post() {
		//Method 1
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "Suchen");
		map.put("job", "Runner");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		//Method 2
		request.put("name", "jai");
		request.put("job", "student'");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		       header("Content-Type", "application/json").
		       contentType (ContentType.JSON).
		       accept(ContentType.JSON).
		       body(request.toJSONString()).
		when().
		       post("https://reqres.in/api/users").
		then().
		       statusCode(201);
		

}
}
