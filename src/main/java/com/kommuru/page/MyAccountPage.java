package com.kommuru.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * The class is used to capture my account page web elements and it's methods.
 *
 * @author Reddy
 */
public class MyAccountPage extends BasePage {

    @FindBy(css = ".page-heading")
    private WebElement myAccount;

    @FindBy(css = ".logout")
    private WebElement logout;

    public MyAccountPage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }


    public String myAccountText() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(myAccount));
        return myAccount.getText();
    }

    public SignInPage clickOnSignout() {
        logout.click();
        return new SignInPage();
    }
}
