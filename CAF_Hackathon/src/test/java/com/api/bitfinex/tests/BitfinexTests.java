package com.api.bitfinex.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.cucumber.datatable.DataTable;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class BitfinexTests {
	
	static RequestSpecification request;
	List<List<String>> data;
	static Response response;
	JsonPath jsonPath ;
	static ArrayList dataList;

	/*
	 * @Test public void bitfinexAPIWithOneArgument() { Response response =
	 * given().queryParam("symbols", "tBTCUSD").when()
	 * .get("https://api-pub.bitfinex.com/v2/tickers"); //
	 * response.then().log().all(); JsonPath jsonPath = response.jsonPath();
	 * ArrayList dataList = jsonPath.get();
	 * 
	 * for (int i = 0; i < dataList.size(); i++) {
	 * System.out.println(dataList.get(i)); } }
	 */
	
	/*
	 * @Test public void bitfinexAPIWithMultipleArguments() { Response response =
	 * given().queryParam("symbols", "tBTCUSD","tLTCBTC")
	 * 
	 * 
	 * .when() .get("https://api-pub.bitfinex.com/v2/tickers");
	 * 
	 * JsonPath jsonPath = response.jsonPath(); ArrayList dataList = jsonPath.get();
	 * 
	 * for (int i = 0; i < dataList.size(); i++) {
	 * System.out.println(dataList.get(i)); } }
	 */
	
	
	
	@Given("Set the baseURI  and  Set the  ticker name")
	public void setTheBaseURI(DataTable datatable) {
		data = datatable.asLists(String.class);
		System.out.println("Data : "+data.get(1).get(0));
		given().baseUri(data.get(1).get(0));
		request = RestAssured.given();
		request.queryParam("symbols", data.get(1).get(1));
	}

	@When("Set the HTTP Method get and end point")
	public void setTheHTTPMethodGetAndEndPoint(DataTable datatable) {
		data = datatable.asLists(String.class);
		response = request.get(data.get(1).get(0));
		 jsonPath = response.jsonPath();
		 dataList = jsonPath.get();
	}

	@Then("Check the status code  for single ticker name")
	public void checkTheStatusCodeForSingleTickerName(DataTable datatable) {
		data = datatable.asLists(String.class);
	  Assert.assertEquals(response.getStatusCode(), 200);
	
	}

	@Then("Check the ticker name in response")
	public void checkTheTickerNameInResponse(DataTable datatable) {
		data = datatable.asLists(String.class);
		  Assert.assertEquals(data.get(1).get(0), dataList.get(0));
	}

	@Then("Check the full response")
	public void checkTheFullResponse() {
	  
	}

	/*
	 * @Given("Set the invalid ticker name {string}") public void
	 * setTheInvalidTickerName(String string) {
	 * 
	 * }
	 * 
	 * @When("Set the HTTP Method get end point") public void
	 * setTheHTTPMethodGetEndPoint() {
	 * 
	 * }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() {
	 * 
	 * }
	 * 
	 * @Then("Check the Empty response") public void checkTheEmptyResponse() {
	 * 
	 * }
	 * 
	 * @Given("Set the invalid ticker name {string}") public void
	 * setTheInvalidTickerName(String string) {
	 * 
	 * }
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
	 * @Given("Donot set the request arguments") public void
	 * donotSetTheRequestArguments() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @When("Set the HTTP Method get end point") public void
	 * setTheHTTPMethodGetEndPoint() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the Empty reponse") public void checkTheEmptyReponse() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Given("Set the  request argument") public void setTheRequestArgument() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @When("Set the HTTP Method get and invalid end point") public void
	 * setTheHTTPMethodGetAndInvalidEndPoint() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check the status code") public void checkTheStatusCode() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("Check Error message in response") public void
	 * checkErrorMessageInResponse() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */
}
