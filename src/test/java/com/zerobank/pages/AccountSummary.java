package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummary {
    public AccountSummary(){
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(xpath = "//li[@id='account_summary_tab']")
    public WebElement AccountsummaryTab;

    @FindBy(xpath = "(//a[@style])[1]")
    public WebElement Savings;

    @FindBy(xpath = "(//a[@style='text-decoration: underline'])[3]")
    public WebElement Brokerage;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement Checking;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement CreditCard;

    @FindBy(xpath = "//a[contains(text(),'Loan')]")
    public WebElement LoanLink;

    @FindBy(xpath = "//*[text()='Account Activity']")
     public WebElement AccountActivity;

//    @FindBy(xpath = "//a[contains(text(),'Account Activity')]")
 //   public WebElement AccountActivity;

    @FindBy(xpath = "//a[contains(text(),'Transfer Funds')]")
    public WebElement TransferFunds;

    @FindBy(xpath = "//a[contains(text(),'Pay Bills')]")
    public WebElement PayBills;

    @FindBy(xpath = "//a[contains(text(),'My Money Map')]")
    public WebElement MyMoneyMap;

    @FindBy(xpath = "//a[contains(text(),'Online Statements')]")
    public WebElement OnlineStatements;

    @FindBy(xpath = "(//*[.='2012-09-06'])[2])" )
    public List<WebElement> enddate;

    @FindBy(xpath ="(//*[.='2012-09-01'])[2])")
    public List<WebElement> startdate;


public void Savingsclick() {
    Savings.click();
}

    public  void AccountActivity(WebElement e){
        AccountActivity.click();

}


}
