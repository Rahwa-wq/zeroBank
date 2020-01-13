package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigation_StepDef {
    LoginPage loginPage = new LoginPage();
    AccountSummary accountSummary = new AccountSummary();
    AccountActivity accountActivity = new AccountActivity();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitFor(2);
        loginPage.signin.click();
        BrowserUtils.waitFor(2);
        loginPage.Login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));

    }

    @When("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
      accountSummary.Savingsclick();
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        String actualTitle = Driver.get().getTitle();
       Assert.assertEquals("Zero - Account Activity",actualTitle);

    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        Select select = new Select(accountActivity.dropdown);
        Assert.assertEquals("Savings", select.getFirstSelectedOption().getText());


    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        accountSummary.AccountsummaryTab.click();
        accountSummary.Brokerage.click();

    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {
     Select select = new Select(accountActivity.brokeragedropdown);
        System.out.println(select.getFirstSelectedOption().getText());
     Assert.assertEquals("Brokerage",select.getFirstSelectedOption().getText());

    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
    accountSummary.Checking.click();
    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
        Select select = new Select(accountActivity.checkingdropdown);
        Assert.assertEquals("Checking",select.getFirstSelectedOption().getText());
        System.out.println(select.getFirstSelectedOption().getText());
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        accountSummary.CreditCard.click();

    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {
   Select select = new Select(accountActivity.creditcarddropdown);
    Assert.assertEquals("Credit Card",select.getFirstSelectedOption().getText());
        System.out.println((select.getFirstSelectedOption().getText()));
    }

    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page() {
        accountSummary.LoanLink.click();

    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        Select select = new Select(accountActivity.loandropdown);
        Assert.assertEquals("Loan",select.getFirstSelectedOption().getText());
        System.out.println(select.getFirstSelectedOption().getText());


    }


}


