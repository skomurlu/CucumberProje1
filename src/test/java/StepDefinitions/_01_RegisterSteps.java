package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Enter the valid data and create account")
    public void enterTheValidDataAndCreateAccount() {
        dc.findAndClick("registerButton");
        dc.findAndSend("firstName", "Safak");
        dc.findAndSend("lastName", "Komurlu");
        dc.findAndSend("address", "Kayisdagi");
        dc.findAndSend("city", "Istanbul");
        dc.findAndSend("state", "Turkey");
        dc.findAndSend("zipCode", "34755");
        dc.findAndSend("phoneNumber", "5325555555");
        dc.findAndSend("ssn", "5555555");
        dc.findAndSend("username", "safak");
        dc.findAndSend("password", "safakk123");
        dc.findAndSend("repeatedPassword", "safakk123");
        dc.findAndClick("andRegister");
    }

    @Then("Account should be created successfully")
    public void accountShouldBeCreatedSuccessfully() {
        dc.findAndContainsText("verifyRegister", "successfully");
    }
}
