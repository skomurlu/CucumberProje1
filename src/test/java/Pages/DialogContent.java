package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="//a[text()='Register']")
    private WebElement registerButton;

    @FindBy(id="customer.firstName")
    private WebElement firstName;

    @FindBy(id="customer.lastName")
    private WebElement lastName;

    @FindBy(id="customer.address.street")
    private WebElement address;

    @FindBy(id="customer.address.city")
    private WebElement city;

    @FindBy(id="customer.address.state")
    private WebElement state;

    @FindBy(id="customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id="customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id="customer.ssn")
    private WebElement ssn;

    @FindBy(id="customer.username")
    private WebElement username;

    @FindBy(id="customer.password")
    private WebElement password;

    @FindBy(id="repeatedPassword")
    private WebElement repeatedPassword;

    @FindBy(css = "[value='Register'][class='button']")
    private WebElement confirmAndRegister;

    @FindBy(xpath = "//*[text()='Your account was created successfully. You are now logged in.']")
    private WebElement verifyRegister;

    @FindBy(css= "input[name='username']")
    private WebElement loginUsername;

    @FindBy(css= "input[name='password']")
    private WebElement loginPassword;

    @FindBy(css= "[type='submit'][value='Log In']")
    private WebElement loginButton;

    @FindBy(css = "[class='title']")
    public WebElement verify;

    @FindBy(xpath="//a[text()='Bill Pay']")
    private WebElement billPayButton;

    @FindBy(css= "input[name='payee.name']")
    private WebElement payeeName;

    @FindBy(css= "input[name='payee.address.street']")
    private WebElement payeeAddress;

    @FindBy(css= "input[name='payee.address.city']")
    private WebElement payeeCity;

    @FindBy(css= "input[name='payee.address.state']")
    private WebElement payeeState;

    @FindBy(css= "input[name='payee.address.zipCode']")
    private WebElement payeeZipCode;

    @FindBy(css= "input[name='payee.phoneNumber']")
    private WebElement payeePhoneNumber;

    @FindBy(css= "input[name='payee.accountNumber']")
    private WebElement payeeAccountNumber;

    @FindBy(css= "input[name='verifyAccount']")
    private WebElement verifyAccount;

    @FindBy(css= "input[name='amount']")
    private WebElement amount;

    @FindBy(css= "[type='submit'][value='Send Payment']")
    private WebElement paymentButton;

    @FindBy(xpath = "//*[text()='Bill Payment Complete']")
    private WebElement billPaymentComplete;

    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "firstName" : myElement =firstName; break;
            case "lastName" : myElement =lastName; break;
            case "address" : myElement =address; break;
            case "city" : myElement =city; break;
            case "state" : myElement =state; break;
            case "zipCode" : myElement =zipCode; break;
            case "phoneNumber" : myElement =phoneNumber; break;
            case "ssn" : myElement =ssn; break;
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "repeatedPassword" : myElement =repeatedPassword; break;
            case "LogInUsername" : myElement =loginUsername; break;
            case "LogInPassword" : myElement =loginPassword; break;
            case "payeeName" : myElement =payeeName; break;
            case "payeeAddress" : myElement =payeeAddress; break;
            case "payeeCity" : myElement =payeeCity; break;
            case "payeeState" : myElement =payeeState; break;
            case "payeeZipCode" : myElement =payeeZipCode; break;
            case "payeePhoneNumber" : myElement =payeePhoneNumber; break;
            case "payeeAccountNumber" : myElement =payeeAccountNumber; break;
            case "verifyAccount" : myElement =verifyAccount; break;
            case "amount" : myElement =amount; break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "registerButton" : myElement =registerButton; break;
            case "andRegister" : myElement =confirmAndRegister; break;
            case "logInButton" : myElement =loginButton; break;
            case "billPayButton" : myElement =billPayButton; break;
            case "paymentButton" : myElement =paymentButton; break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "verifyRegister" : myElement=verifyRegister; break;
            case "positiveLogin" : myElement=verify; break;
            case "NegativeLogin" : myElement=verify; break;
            case "billPaymentCompleted" : myElement =billPaymentComplete; break;
        }

        verifyContainsText(myElement,text);
    }

}
