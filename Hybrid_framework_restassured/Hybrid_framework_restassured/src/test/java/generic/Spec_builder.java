package generic;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builder {
	
	@BeforeMethod
	public RequestSpecification request(String body,String content) {
		
		RequestSpecBuilder sp = new RequestSpecBuilder();
		 RequestSpecification req = sp.setBody(body).setContentType(content).build();
		 return req;
	}
	
	@AfterMethod
	public ResponseSpecification response(int code,String line,long time,
			String B_key,String B_value,String H_key,String H_value)
	{
		ResponseSpecBuilder sp = new ResponseSpecBuilder();
		ResponseSpecification res = sp.expectStatusCode(code).expectStatusLine(line)
		.expectResponseTime(Matchers.lessThanOrEqualTo(time))
		.expectBody(B_key,Matchers.equalTo(B_value)).expectHeader(H_key, Matchers.equalTo(H_value)).build();
		return res;
	}
	
}
