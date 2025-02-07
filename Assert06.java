package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert06 {
    @Description("Open URL https://sellxpert.in/ and get title")
    @Test
    public void test_Selenium01(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://sellxpert.in/");

        //Assert.assertEquals(driver.getTitle(), "CRM-Login"); //-> result will be fail
        // Expected :CRM-Login
        //Actual   :CRM - Login
        // 0 Passed 1 Failed

         Assert.assertEquals(driver.getTitle(), "CRM - Login"); // Result will be pass


    }
}
