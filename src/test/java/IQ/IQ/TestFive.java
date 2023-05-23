package IQ.IQ;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestFive {
	
	@Test
	public void abc() {
		
		
		//http://localhost:8080/employee/%7Bid%7D
		
		RequestSpecification req = RestAssured
				.given()
				.log()
				.all()
				.baseUri("http://localhost:8080");
		
		Response res = req
				.when()
				.get("/employee/1")
				.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200)
				.extract()
				.response();
		
		System.out.println("Response is "+res.toString());
		
		
				
	}
}
