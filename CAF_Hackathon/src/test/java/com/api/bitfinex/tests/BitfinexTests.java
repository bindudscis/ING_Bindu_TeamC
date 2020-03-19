package com.api.bitfinex.tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.junit.Test;

public class BitfinexTests {

	@Test
	public void  bitfinexAPIWithOneArgument() {
		Response response = given().queryParam("symbols", "tBTCUSD").when().get("https://api-pub.bitfinex.com/v2/tickers");
		//		response.then().log().all();
		JsonPath jsonPath = response.jsonPath();
		ArrayList<String> dataList =	jsonPath.get();
		for(String data:dataList) {

			System.out.println(data);
		}
	}
}
