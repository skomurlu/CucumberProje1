package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {

    DialogContent dc=new DialogContent();
    @When("Enter utility and bill and click payment button name as {string} password as {string}")
    public void enterUtilityAndBillAndClickPaymentButtonNameAsPasswordAs(String utility, String bill) {
        dc.findAndClick("billPayButton");
        dc.findAndSend("payeeName", utility);
        dc.findAndSend("payeeAddress", "Atasehir");
        dc.findAndSend("payeeCity", "Kayisdagi");
        dc.findAndSend("payeeState", "Istanbul");
        dc.findAndSend("payeeZipCode", "34755");
        dc.findAndSend("payeePhoneNumber", "5325555555");
        dc.findAndSend("payeeAccountNumber", "5555555");
        dc.findAndSend("verifyAccount", "5555555");
        dc.findAndSend("amount", bill);
        dc.findAndClick("paymentButton");

    }

    @Then("Payment message should be displayed")
    public void paymentMessageShouldBeDisplayed() {
        dc.findAndContainsText("billPaymentCompleted", "Complete");

    }
}
