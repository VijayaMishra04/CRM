package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class WebdriverHierarchy04 {
    @Description("Open URL https://sellxpert.in/ and get title")
    @Test
    public void test_Selenium02(){

        //Webdriver hierarchy ->
        //SearchContext(I) I-(2)
        // -> WebDriver(I)(10)
        // ->RemotewebDriver(C)(15)
        // ->chromium(C)(25)
        // -> EdgeDriver(C) (45)

        //SearchContext - Interface - Findelement,Findelement(it has 2 functions) - GGF(Great Grand Father)
        //WebDriver - Interface - Some incomplete functions - GF
        //RemoteWebDriver - Class - It also has some functions - F
        //ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorer - Class - S

        //SearchContext driver = new ChromeDriver();
        //WebDriver driver = new ChromeDriver();
        //RemoteWebDriver = new ChromeDriver();
        //ChromeDriver = new ChromeDriver();

        //Scenario
        //1. Do you want to run on Chrome or Edge?
        //ChromeDriver driver = new ChromeDriver(); - 1%

        //2. Do you want to run on chrome then change to edge?
        //WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver(); - 97%
        //WebDriver driver = new FirefoxDriver(); - 97%

        //3. Do you want to run on multiple browsers , AWS machine ? - 2%
        //RemoteWebDriver driver (with GRID) - Advance (Last 2 Session)

    }
}
