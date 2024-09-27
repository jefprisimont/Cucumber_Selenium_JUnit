package com.jefri.stepdef;

import com.jefri.Page.ApiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiStepDef {

    ApiPage apiPage;

    public ApiStepDef() {
        this.apiPage =new ApiPage();
    }

    @Given("I set GET method to {string}")
    public void iSetGETMethodTo(String url) {
        apiPage.sendURL(url);
    }

    @When("I send the request")
    public void iSendTheRequest() {
        apiPage.sendTheRequest();
    }

    @Then("I should recieve a {int} status code")
    public void iShouldRecieveAStatusCode(int status_code) {
        apiPage.validateStatusCode(status_code);
    }

    @Then("I should validate response body for single user")
    public void iShouldValidateResponseBodyForSingleUser() {
        apiPage.validateResponseBody();
    }

    @Then("I should validate response json with JSONSchema {string}")
    public void iShouldValidateResponseJsonWithJSONSchema(String fileName) {
        apiPage.validateJSONSchema(fileName);
    }

    @Given("I have an invalid user ID {string}")
    public void iHaveAnInvalidUserID(String url) {
        apiPage.sendURL(url);
    }

}
