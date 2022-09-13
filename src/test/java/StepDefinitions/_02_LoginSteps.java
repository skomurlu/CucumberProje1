package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    DialogContent dc=new DialogContent();
    @When("Enter username and password and click button name as {string} password as {string}")
    public void enterUsernameAndPasswordAndClickButtonNameAsPasswordAs(String name, String password) {
        dc.findAndSend("LogInUsername", name);
        dc.findAndSend("LogInPassword", password);
        dc.findAndClick("logInButton");

    }

    @Then("Login message should be displayed")
    public void loginMessageShouldBeDisplayed() {
        if (dc.verify.getText().contains("Overview"))
        {
            dc.findAndContainsText("positiveLogin", "Overview");
        }
        if (dc.verify.getText().contains("error"))
        {
            dc.findAndContainsText("NegativeLogin", "error");
        }
    }
}
