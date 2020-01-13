package com.zerobank.stepdefinitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import gherkin.ast.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setup(){
        System.out.println("This comes before everything.");
    }
    @After
    public void tearDown() throws InterruptedException {
        BrowserUtils.waitFor(5);
        Driver.closeDriver();
    }



}
