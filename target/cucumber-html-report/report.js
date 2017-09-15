$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/GiftCard.feature");
formatter.feature({
  "line": 3,
  "name": "Home Page Login",
  "description": "User should login to forever new",
  "id": "home-page-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login",
  "description": "",
  "id": "home-page-login;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression1"
    },
    {
      "line": 6,
      "name": "@Regression2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am registered user",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I open Forever login page and enter login details \u0027\u003cUserName\u003e\u0027 and \u0027\u003cPasswd\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should login to the forever new",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "home-page-login;login;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Passwd"
      ],
      "line": 12,
      "id": "home-page-login;login;;1"
    },
    {
      "cells": [
        "k.keerthipriya@gmail.com",
        "kiran143"
      ],
      "line": 13,
      "id": "home-page-login;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4722664094,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "home-page-login;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Regression2"
    },
    {
      "line": 6,
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am registered user",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I open Forever login page and enter login details \u0027k.keerthipriya@gmail.com\u0027 and \u0027kiran143\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should login to the forever new",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginDefinition.i_am_registered_user()"
});
formatter.result({
  "duration": 2011956973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "k.keerthipriya@gmail.com",
      "offset": 51
    },
    {
      "val": "kiran143",
      "offset": 82
    }
  ],
  "location": "LoginDefinition.i_enter_the_login_details_as_k_keerthipriya_gmail_com_and_kiran(String,String)"
});
formatter.result({
  "duration": 2401029644,
  "status": "passed"
});
formatter.match({
  "location": "LoginDefinition.i_should_login_to_the_forever_new_website()"
});
formatter.result({
  "duration": 28073,
  "status": "passed"
});
formatter.after({
  "duration": 47694,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 25,
  "name": "GiftCard in",
  "description": "",
  "id": "home-page-login;giftcard-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression3"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I open the Forever New page \u0027\u003cUname\u003e\u0027 and \u0027\u003cPwd\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I open gift cards page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "give all the details with invalid email id \u0027\u003cGiftCardValue\u003e\u0027 and \u0027\u003cQTY\u003e\u0027 and \u0027\u003cSenName\u003e\u0027 and \u0027\u003cSenEmail\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I should not be able to go ahead with purchasing and should throw an error message",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "home-page-login;giftcard-in;",
  "rows": [
    {
      "cells": [
        "Uname",
        "Pwd",
        "GiftCardValue",
        "QTY",
        "SenName",
        "SenEmail"
      ],
      "line": 31,
      "id": "home-page-login;giftcard-in;;1"
    },
    {
      "cells": [
        "k.keerthipriya@gmail.com",
        "kiran143",
        "Gift Card CA +$50.00",
        "1",
        "Keerthi",
        "k.keerthipriya@gmail"
      ],
      "line": 32,
      "id": "home-page-login;giftcard-in;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4051919301,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "GiftCard in",
  "description": "",
  "id": "home-page-login;giftcard-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 24,
      "name": "@Regression3"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I open the Forever New page \u0027k.keerthipriya@gmail.com\u0027 and \u0027kiran143\u0027",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I open gift cards page",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "give all the details with invalid email id \u0027Gift Card CA +$50.00\u0027 and \u00271\u0027 and \u0027Keerthi\u0027 and \u0027k.keerthipriya@gmail\u0027",
  "matchedColumns": [
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I should not be able to go ahead with purchasing and should throw an error message",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "k.keerthipriya@gmail.com",
      "offset": 29
    },
    {
      "val": "kiran143",
      "offset": 60
    }
  ],
  "location": "GiftCardDefn.i_open_the_Forever_Page2(String,String)"
});
formatter.result({
  "duration": 5237993598,
  "status": "passed"
});
formatter.match({
  "location": "GiftCardDefn.i_open_gift_card_Page2()"
});
formatter.result({
  "duration": 3449904687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gift Card CA +$50.00",
      "offset": 44
    },
    {
      "val": "1",
      "offset": 71
    },
    {
      "val": "Keerthi",
      "offset": 79
    },
    {
      "val": "k.keerthipriya@gmail",
      "offset": 93
    }
  ],
  "location": "GiftCardDefn.i_give_all_giftCard_details2(String,String,String,String)"
});
formatter.result({
  "duration": 671335534,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ter a valid email ad[]ress. For example jo...\u003e but was:\u003c...ter a valid email ad[d]ress. For example jo...\u003e\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat com.forever.testautomation.steps.NewGiftCardSteps.enterGiftCardDetails2(NewGiftCardSteps.java:137)\r\n\tat com.forever.testautomation.stepdefinitions.GiftCardDefn.i_give_all_giftCard_details2(GiftCardDefn.java:65)\r\n\tat ✽.And give all the details with invalid email id \u0027Gift Card CA +$50.00\u0027 and \u00271\u0027 and \u0027Keerthi\u0027 and \u0027k.keerthipriya@gmail\u0027(features/GiftCard.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GiftCardDefn.i_should_not_be_able_to_go_to_next_page2()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 41657,
  "status": "passed"
});
});