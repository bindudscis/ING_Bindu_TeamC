Feature: Bitfinex APIS to get different data based on ticker  names.

  Scenario: Bitfinex API with single ticker name
    Given Set the baseURI  and  Set the  ticker name
      | BaseURI                      | tickerName |
      | https://api-pub.bitfinex.com | tBTCUSD    |
    When Set the HTTP Method get and end point
      | Endpoint    |
      | /v2/ticker2 |
    Then Check the status code  for single ticker name
      | ExpectedStatusCode |
      |                200 |
    And Check the ticker name in response
      | ExpectedTickerName |
      | tBTCUSD            |

  Scenario: Bitfinex API with multiple ticker names
    Given Set the  multiple ticker names
      | Ticker Name             |
      | tBTCUSD,tLTCBTC,tETHUSD |
    When Set the HTTP Method get and  end point for multiple ticker names
      | Endpoint    |
      | /v2/ticker2 |
    Then Check the status code  for multiple ticker names
      | ExpectedStatusCode |
      |                200 |
    And Validate all  the ticker names in response
      | Ticker Name             |
      | "tBTCUSD,tLTCBTC,tETHUSD" |

  
  Scenario Outline: Bitfinex API with invalid  ticker names
    Given Set the invalid ticker name "<TickerName>"
    When Set the HTTP Method get end point
    Then Check the status code
    And Check the Empty response

    Examples: 
      | TickerName |
      |       1234 |
      | @#$!%^     |
      | null       |
      |            |

  Scenario: Bitfinex API with invalid endpoint
    Given Set the  request argument
    When Set the HTTP Method get and invalid end point
    Then Check the status code
    And Check Error message in response

