
Feature: Bitfinex APIS to get different data based on ticker  names.

  Scenario: Bitfinex API with single ticker name
    Given Set the baseURI  and  Set the  ticker name 
    |BaseURI										 |tickerName|
    |https://api-pub.bitfinex.com|tBTCUSD		|
    When Set the HTTP Method get and end point 
    |Endpoint		|
    |/v2/ticker2|
    Then Check the status code  for single ticker name
    |ExpectedStatusCode|
    |200|
    And Check the ticker name in response
    |ExpectedTickerName|
     |tBTCUSD|
    And Check the full response

 
 
    
    
    
    
    
    
    
    
