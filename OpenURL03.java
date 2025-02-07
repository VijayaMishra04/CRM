package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OpenURL03 {
    @Description("Open URL https://sellxpert.in/ and get title")
    @Test
    public void test_Selenium01(){

        //selenium 3
        // Need to setup Driver(browser)
        //System.setProperty("webdriver.gecko.driver","C:\\geckdriver");

        //selenium 4
        //Selenium Manager - utility - It can download the driver automatically
        //Start and stop itself
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sellxpert.in/");
    }
}
