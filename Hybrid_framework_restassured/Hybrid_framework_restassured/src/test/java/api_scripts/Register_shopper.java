package api_scripts;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import POJO.RegisterPojo;
import generic.Spec_builder;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.Read_property;

public class Register_shopper {
	
	@Test
	public void register() throws IOException {
		String r_mail = RandomStringUtils.randomAlphanumeric(6)+"@gmail.com";
		//declaration of POJO
		RegisterPojo rp = new RegisterPojo();
		rp.setCity("Bangalore");
		rp.setCountry("India");
		rp.setEmail(r_mail);
		rp.setFirstName("Test");
		rp.setGender("MALE");
		rp.setLastName("QA");
		rp.setPassword("Test@123");
		rp.setPhone(7483530720l);
		rp.setState("Karnataka");
		rp.setZoneId("ALPHA");
		
		ObjectMapper obj = new ObjectMapper();
		String jsonbody = obj.writeValueAsString(rp);
		
		//fetching data from property file
		Read_property gp = new Read_property();
		String url = gp.property("./Property_file/Framework.properties", "baseUrl");
		String endpoint = gp.property("./Property_file/Framework.properties", "register_endpoint");
		String content = gp.property("./Property_file/Framework.properties", "contentType");
		String line = gp.property("./Property_file/Framework.properties", "status_line");
		
		//fetch from generic
		Spec_builder sp = new Spec_builder();
		RequestSpecification request = sp.request(jsonbody, content);
		ResponseSpecification response = sp.response(201, line, 5000l, "message","Created" ,"Server","nginx");
		
		RestAssured.given().relaxedHTTPSValidation().spec(request)
		.when().post(url+endpoint).then().spec(response).log().all();
		
		
		
			
			
		
	}

}
