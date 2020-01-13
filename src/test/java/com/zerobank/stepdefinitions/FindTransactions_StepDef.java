package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FindTransactions_StepDef {

    AccountActivity accountActivity = new AccountActivity();
    AccountSummary accountSummary = new AccountSummary();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        accountSummary.AccountActivity.click();
        BrowserUtils.waitFor(2);
        accountActivity.findTransactionsbtn.click();

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String startDate, String endDate) {
     //BrowserUtils.waitForPageToLoad(5);
        BrowserUtils.waitFor(5);
    accountActivity.dates1btn.clear();
    accountActivity.dates1btn.sendKeys(startDate);
  //  BrowserUtils.waitFor(2);
    accountActivity.dates2btn.clear();
    accountActivity.dates2btn.sendKeys(endDate);

    }

    @When("clicks search")
    public void clicks_search() throws InterruptedException {
    BrowserUtils.waitForPageToLoad(3);
    accountActivity.FindButton.click();
    BrowserUtils.waitForPageToLoad(3);

    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String startDate, String endDate) {


    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {


    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String startDate) {


    }

    @When("the user enters description {string}")
    public void the_user_enters_description_ONLINE(String desctiption) throws InterruptedException {


    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing_ONLINE(String description) {

    }

    @But("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing_OFFICE(String description) {

    }


    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {

    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {

    }

    @When("user selects type {string}")
    public void user_selects_type_Deposit(String type) {


    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {


    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {

    }


    public static void main(String[] args) {

    }
}
