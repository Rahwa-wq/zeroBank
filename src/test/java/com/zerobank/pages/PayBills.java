package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Name;
import java.security.PublicKey;
import java.util.NoSuchElementException;

public class PayBills {
    public PayBills(){
        PageFactory.initElements(Driver.get(), this);
    }

  //  @FindBy(id = "pay_bills_tab")
  //  public WebElement PayBillsButton;


    @FindBy(linkText = "Add New Payee")
    public WebElement Addnewpayee;

    @FindBy (id = "np_new_payee_name")
    public WebElement payeename;

    @FindBy (id = "np_new_payee_address")
    public WebElement payeeaddress;

    @FindBy (id = "np_new_payee_account")
    public WebElement payeeaccount;

    @FindBy (id = "np_new_payee_details")
    public WebElement payeedetails;

    @FindBy(id = "add_new_payee")
    public WebElement AddButton;

    @FindBy(id="alert_content")
    public WebElement successalrt;

public void addnewpayee(String name, String address, String account, String details){
    payeename.sendKeys(name);
    payeeaddress.sendKeys(address);
    payeeaccount.sendKeys(account);
    payeedetails.sendKeys(details);
    AddButton.click();
}



    }









