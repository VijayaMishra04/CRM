package com.vijaya.Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class OptionClass09 {
    @Description("Option Class")
    @Test
    public void test_Selenium01() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();

//        EdgeOptions -> It will help you set the browser
        //Option to browser
        //window - size
        //Headless mode - There is no UI -> Advantage - Fast execution
        //Full UI mode - Default UI Browser
        //Incognito mode - switch
        // Star Max
        //Add Extensions - Browsers
        //100 + others , https,http
        //Local storage, download ?
        //chrome options - https://peter.sh/experiments/chromium-command-line-switches/

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--incognito");
//        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--headless");


//  Headless Mode-> For run more than 500 test cases at a time it will automatically switch to headless mode
//  And it should for good speed otherwise execution will be very slow it will take 13-14 hrs without headless mode.
//  with headless mode it will take 3-4 hrs.

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");
        Thread.sleep(15000);
        driver.quit();


    }
}
