package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class AddNewPayee_StepDef {
    AccountSummary accountSummary = new AccountSummary();
    LoginPage loginPage = new LoginPage();
    PayBills paybills = new PayBills();

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
        loginPage.signin.click();
        BrowserUtils.waitFor(2);
        loginPage.Login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
        accountSummary.PayBills.click();
        paybills.Addnewpayee.click();


    }

   @Given("creates new payee using following information")//Map<String,String> map
    public void creates_new_payee_using_following_information(Map<String,String>userData ) {
//        paybills.addnewpayee(userData.get("Payee Name"),userData.get("Payee Address"),userData.get("Account"),userData.get("Payee details"));
    //    paybills.Click();
       BrowserUtils.waitForPresenceOfElement(By.id("np_new_payee_name"), 3);
       paybills.payeename.sendKeys(userData.get("Payee Name"));
       paybills.payeeaddress.sendKeys(userData.get("Payee Address"));
       paybills.payeeaccount.sendKeys(userData.get("Account"));
       paybills.payeedetails.sendKeys(userData.get("Payee details"));
       paybills.AddButton.click();


    }

//    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed PurchaseForeignCurrency.feature")
//    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed_PurchaseForeignCurrency_feature() {
//        paybills.successalrt.getText();
//
//
//    }


}
