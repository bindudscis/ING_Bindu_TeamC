$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/BitfinexAPI.feature");
formatter.feature({
  "name": "Bitfinex APIS to get different data based on ticker  names.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Bitfinex API with single ticker name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Set the baseURI  and  Set the  ticker name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheBaseURI(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set the HTTP Method get and end point",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheHTTPMethodGetAndEndPoint(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the status code  for single ticker name",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.checkTheStatusCodeForSingleTickerName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the ticker name in response",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.checkTheTickerNameInResponse(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Bitfinex API with multiple ticker names",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Set the  multiple ticker names",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheMultipleTickerName(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Set the HTTP Method get and  end point for multiple ticker names",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheHTTPMethodGetEndPoint(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the status code  for multiple ticker names",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.checkTheStatusCode(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate all  the ticker names in response",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.checkTheEmptyResponse(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Bitfinex API with invalid  ticker names",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Set the invalid ticker name \"\u003cTickerName\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "TickerName"
      ]
    },
    {
      "cells": [
        "1234"
      ]
    },
    {
      "cells": [
        "@#$!%^"
      ]
    },
    {
      "cells": [
        "null"
      ]
    },
    {
      "cells": [
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Bitfinex API with invalid  ticker names",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Set the invalid ticker name \"1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheRequestArgument(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Bitfinex API with invalid  ticker names",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Set the invalid ticker name \"@#$!%^\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheRequestArgument(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Bitfinex API with invalid  ticker names",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Set the invalid ticker name \"null\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheRequestArgument(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Bitfinex API with invalid  ticker names",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Set the invalid ticker name \"\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheRequestArgument(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Bitfinex API with invalid endpoint",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Set the  request argument",
  "keyword": "Given "
});
formatter.match({
  "location": "com.api.bitfinex.tests.BitfinexTests.setTheRequestArgument()"
});
formatter.result({
  "status": "passed"
});
});