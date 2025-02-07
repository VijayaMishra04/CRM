package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTextVerification07 {
    @Description("Open URL and Verify 1st Text")
    @Test
    public void test_Selenium01() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sellxpert.in");
        driver.manage().window().maximize();
        if (driver.getPageSource().contains("CRM Authorized Agents Only")){
            System.out.println("CRM Authorized Agents Only, is visible");
            Assert.assertTrue(true);
        }
        else{
            throw new Exception("CRM Authorized Agents Only is not visible");
        }

    }
}
