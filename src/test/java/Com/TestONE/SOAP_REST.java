package Com.TestONE;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SOAP_REST 
{
	@Test
	public void rest()
	{
		RestAssured.baseURI="https://reqres.in/api/users";
		
		RestAssured.given().contentType("application/json").
		body("{\r\n    \"name\": \"morpheus\",\r\n    \"job\": \"leader\"\r\n}").
		when().post("").then().statusCode(201);
	
		}
	
	@Test()
	public void soap()
	{
		RestAssured.baseURI="http://www.webservicex.net/globalweather.asmx";
		
		RestAssured.given().contentType("text/xml").
		body("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.webserviceX.NET\">\r\n   <soapenv:Header/>\r\n   <soapenv:Body>\r\n      <web:GetCitiesByCountry>\r\n         <!--Optional:-->\r\n         <web:CountryName>India</web:CountryName>\r\n      </web:GetCitiesByCountry>\r\n   </soapenv:Body>\r\n</soapenv:Envelope>").
		
		when().post("").then().statusCode(200);
	}
	

}
