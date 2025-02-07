package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Navigation08 {
    @Description("Navigate URL")
    @Test
    public void test_Selenium01(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/"); //95% using get()
        //Nevigation in selenium -
        // get() -> there is no option to go back , forward or refresh
        // navigate.to() -> back() , forward() , refresh()
        //no other difference in both
        driver.navigate().to("https://sellxpert.in/"); //rare use
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}
