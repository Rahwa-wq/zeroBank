package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);

    }


    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signin;

    @FindBy (xpath = "//input[@id='user_login']")
    public WebElement usernameBox;


    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertmsg;

    public void Login(String username,String password){

        usernameBox.sendKeys(username);
        BrowserUtils.waitFor(2);
        passwordBox.sendKeys(password);
        BrowserUtils.waitFor(2);
        loginButton.click();
    }


}
