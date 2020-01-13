package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class AccountActivity {


    public AccountActivity(){
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css= " select.input-xlarge")
    public WebElement dropdownSaving;


   @FindBy (id = "aa_accountId")
    public WebElement dropdown;

   @FindBy(xpath = "//select[@id=\'aa_accountId\']")
   public WebElement brokeragedropdown;

    @FindBy(xpath = "//select[@name=\"accountId\"]")
    public WebElement checkingdropdown;

    @FindBy(xpath = "//select[@required=\"required\"]")
    public WebElement creditcarddropdown;

    @FindBy(xpath = "//select[@id=\"aa_accountId\"]" )
    public WebElement loandropdown;


 @FindBy(css = ".table.table-condensed.table-hover")
    public WebElement tables;


    @FindBy(xpath = "//li[@class='ui-state-default ui-corner-top']//a")
    public WebElement findTransactionsbtn;

    @FindBy(xpath = "//input[@id='aa_fromDate']")
    public WebElement dates1btn;

    @FindBy(xpath = "//input[@id='aa_toDate']")
    public WebElement dates2btn;


    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement FindButton;


  //public void isDisplayedTable(){
    // List<WebElement> lst = (List<WebElement>) tables;
     //for(WebElement each : lst){
       //  System.out.print();
    // }



public void convert(WebElement element){
    Select select = new Select(dropdown);
    select.getFirstSelectedOption();
    System.out.println(select.getFirstSelectedOption());
}

public void broker(WebElement menu){
    Select select = new Select(brokeragedropdown);
    select.getFirstSelectedOption();
    System.out.println(select.getFirstSelectedOption());
}

public void cheking(WebElement locate){
    Select select = new Select(checkingdropdown);
    select.getFirstSelectedOption();
    System.out.println( select.getFirstSelectedOption());
}

public void credit(WebElement web){
    Select select = new Select(creditcarddropdown);
    select.getFirstSelectedOption();
    System.out.println(select.getFirstSelectedOption());
}

public void loan(WebElement st){
    Select select = new Select(loandropdown);
    select.getFirstSelectedOption();

}

    public static void main(String[] args) {
        AccountActivity accountActivity = new AccountActivity();
        accountActivity.convert(accountActivity.dropdown);
        accountActivity.convert(accountActivity.brokeragedropdown);
        accountActivity.convert(accountActivity.checkingdropdown);
        accountActivity.convert(accountActivity.creditcarddropdown);
    }



}








