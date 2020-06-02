package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Forgotten Details?')]")
    WebElement _verifyLoginPage;

    @FindBy(css = "input[name='username']")
    WebElement _enterUserName;

    @FindBy (css = "input[name='password']")
    WebElement _enterPassword;

    @FindBy (css = "button[type='submit']")
    WebElement _clickOnLoginButton;

    public void enterUserName(String userName){
        sendTextToElement(_enterUserName, userName);
    }
    public void enterPassword(String passwd){
        sendTextToElement(_enterPassword, passwd);
    }
    public void clickOnLoginBtn(){
        clickOnElement(_clickOnLoginButton);
    }


    // //input[@name='username'] xpath
//    //input[@name='password']
//    //button[@type='submit']  xpath

//    public String verifyLoginPage() {
//        return getTextFromElement(_verifyLoginPage);
//    }
}
