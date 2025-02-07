package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class URLTitlePageResource05 {
    @Description("Open URL https://sellxpert.in/ and get title")
    @Test
    public void test_Selenium01(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://sellxpert.in");//open URL
        //Print URL, Print Title, Print PageSource
        System.out.println(driver.getTitle()); //getTitle()
        System.out.println(driver.getCurrentUrl()); //getCurrentUrl()
        System.out.println(driver.getPageSource()); //getPageSource() -> HTML Page

        driver.manage().window().maximize();
        driver.manage().window().minimize();


    }
}
