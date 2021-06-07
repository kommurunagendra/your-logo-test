package com.kommuru.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * The class is used to capture sign in page web elements and it's methods.
 *
 * @author Reddy
 */
public class SignInPage extends BasePage {

    @FindBy(id = "email")
    private WebElement email;
    @FindBy(id = "passwd")
    private WebElement pwd;
    @FindBy(id = "SubmitLogin")
    private WebElement signInBtn;
    @FindBy(css = ".page-heading")
    private WebElement authenticationLabel;

    public SignInPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    public void signInButton() {
        signInBtn.click();
    }

    public MyAccountPage enterLoginDetails(String emailId, String password) {
        email.sendKeys(emailId);
        pwd.sendKeys(password);
        signInButton();
        return new MyAccountPage();
    }

    public String getAuthenticationText() {
        return authenticationLabel.getText();
    }
}
