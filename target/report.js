$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTestCases/MMTHomePage.feature");
formatter.feature({
  "name": "Validations for MMT HomePage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the title of homepage",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "MMTHomePageTest.launch_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the title of homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "MMTHomePageTest.verify_the_title_of_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify basic componenets of HomePage",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "MMTHomePageTest.launch_the_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify below basic attributes of the homepage:",
  "rows": [
    {
      "cells": [
        "makemytriplogo"
      ]
    },
    {
      "cells": [
        "searchButton"
      ]
    },
    {
      "cells": [
        "loginAccountButton"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MMTHomePageTest.verify_below_basic_attributes_of_the_homepage(DataTable)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [false] but found [true]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\r\n\tat org.testng.Assert.assertFalse(Assert.java:63)\r\n\tat org.testng.Assert.assertFalse(Assert.java:73)\r\n\tat reporting.ReportingClass.infoLogFail(ReportingClass.java:55)\r\n\tat reporting.ReportingClass.reportFailure(ReportingClass.java:35)\r\n\tat stepDefination.MMTHomePageTest.verify_below_basic_attributes_of_the_homepage(MMTHomePageTest.java:70)\r\n\tat ✽.Verify below basic attributes of the homepage:(src/test/resources/functionalTestCases/MMTHomePage.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});