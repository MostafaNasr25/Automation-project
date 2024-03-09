package com.api_taf.tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class ApiStepDefs extends BaseTest {

    private Response response;

    @Given("the Bored API endpoint is available")
    public void BoredAPIEndpointIsAvailable() {
        RestAssured.baseURI = properties.getProperty("BASE_URL");
    }

    @When("I make a GET request to the API")
    public void iMakeAGETRequestToTheAPI() {
        RequestSpecification request = RestAssured.given();
        response = request.get("/api/activity");
    }

    @Then("response should be with status code {int}")
    public void responseShouldBeWithStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @And("the response should follow the expected schema")
    public void theResponseShouldFollowTheExpectedSchema() {
        response.then().assertThat().body(JsonSchemaValidator
                .matchesJsonSchema(new File("src/test/java/com/api_taf/utilities/json-schema.json")));
    }
}
