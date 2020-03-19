package com.api.bitfinex.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.cucumber.datatable.DataTable;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BitfinexTests {

	static RequestSpecification request;
	static RequestSpecification request1;
	List<List<String>> data;
	static Response response;
	static Response response1;
	JsonPath jsonPath;
	static ArrayList dataList;
	static ResponseBody body;
	String bodyStringValue;

	/*
	 * @Test public void bitfinexAPIWithOneArgument() { Response response =
	 * given().queryParam("symbols", "tBTCUSD").when()
	 * .get("https://api-pub.bitfinex.com/v2/tickers");
	 * 
	 * ResponseBody body = response.getBody(); // String bodyStringValue =
	 * body.asString(); Assert.assertTrue(bodyStringValue.contains("tBTCUSD"));
	 * JsonPath jsonPath = response.jsonPath(); List<Object> value =
	 * jsonPath.getList("[0]"); System.out.println(value);
	 * 
	 * }
	 */

	@Given("Set the baseURI  and  Set the  ticker name")
	public void setTheBaseURI(DataTable datatable) {
		data = datatable.asLists(String.class);
		RestAssured.baseURI = data.get(1).get(0);
		request = RestAssured.given();
		request.queryParam("symbols", data.get(1).get(1));
	}

	@When("Set the HTTP Method get and end point")
	public void setTheHTTPMethodGetAndEndPoint(DataTable datatable) {
		data = datatable.asLists(String.class);
		response = request.get("/v2/tickers");
		body = response.getBody();
		bodyStringValue = body.asString();

	}

	@Then("Check the status code  for single ticker name")
	public void checkTheStatusCodeForSingleTickerName(DataTable datatable) {
		data = datatable.asLists(String.class);
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Then("Check the ticker name in response")
	public void checkTheTickerNameInResponse(DataTable datatable) {
		data = datatable.asLists(String.class);
		Assert.assertTrue(bodyStringValue.contains(data.get(1).get(0)));
	}

	@Given("Set the  multiple ticker names")
	public void setTheMultipleTickerName(DataTable datatable) {

		RestAssured.baseURI = "https://api-pub.bitfinex.com";
		Response res = given().queryParam("symbols", "tBTCUSD,tLTCBTC").when().get("/v2/tickers");
		String tickerResponse = res.andReturn().asString();
		JsonPath json = new JsonPath(tickerResponse);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		String actual = json.get("[1][0]");
		Assert.assertEquals(actual, "tLTCBTC");

	}

	@When("Set the HTTP Method get and  end point for multiple ticker names")
	public void setTheHTTPMethodGetEndPoint(DataTable datatable) {

	}

	@Then("Check the status code  for multiple ticker names")
	public void checkTheStatusCode(DataTable datatable) {

	}

	@Then("Validate all  the ticker names in response")
	public void checkTheEmptyResponse(DataTable datatable) {

	}

	@Given("Set the invalid ticker name {string}")
	public void setTheRequestArgument(String tickerName) {
		RestAssured.baseURI = "https://api-pub.bitfinex.com";
		Response res = given().queryParam("symbols", tickerName).when().get("/v2/tickers");
		res.then().log().all();
		String tickerResponse = res.andReturn().asString();
		JsonPath json = new JsonPath(tickerResponse);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		ArrayList actual = json.get();
		Assert.assertTrue(actual.isEmpty());
		
	}

	@When("Set the HTTP Method get and invalid end point")
	public void setTheHTTPMethodGetAndInvalidEndPoint() {

	}

	@Then("Check the status code") 
	public void checkTheStatusCode() { 
		
	}

	
	@Given("Set the  request argument")
	public void setTheRequestArgument() {
		RestAssured.baseURI = "https://api-pub.bitfinex.com";
		Response res = given().when().get("/v2/tickersInvalid");
		res.then().log().all();
		String tickerResponse = res.andReturn().asString();
		JsonPath json = new JsonPath(tickerResponse);
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	
	/*
	 * @Then("Check Error message in response") public void
	 * checkErrorMessageInResponse() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Set the invalid ticker name {string}") public void
	 * setTheInvalidTickerName(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("Set the HTTP Method get end point") public void
	 * setTheHTTPMethodGetEndPoint() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the Empty response") public void checkTheEmptyResponse() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Set the invalid ticker name {string}") public void
	 * setTheInvalidTickerName(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("Set the HTTP Method get end point") public void
	 * setTheHTTPMethodGetEndPoint() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the Empty response") public void checkTheEmptyResponse() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Set the invalid ticker name {string}") public void
	 * setTheInvalidTickerName(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("Set the HTTP Method get end point") public void
	 * setTheHTTPMethodGetEndPoint() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the Empty response") public void checkTheEmptyResponse() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Set the invalid ticker name {string}") public void
	 * setTheInvalidTickerName(String string) { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("Set the HTTP Method get end point") public void
	 * setTheHTTPMethodGetEndPoint() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the Empty response") public void checkTheEmptyResponse() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

}
