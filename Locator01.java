package com.vijaya.Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Locator01 {
    @Description("Option Class")
    @Test
    public void test_Negative_CRMlogin() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
//        driver.navigate().to("https://sellxpert.in/"); -> we can use navigate as well instead of get
        driver.get("https://sellxpert.in/");

        //1. Fine the email input and enter the emailID.
        //HTML Element ->
        // <input -> Open HTML TAg
        // type="text"
        // name="email_id"
        // id="email_id"
        // class="form-control"
        // placeholder="Enter Your Email/Phone"
        // style=" padding: 1.2rem !important; "
        // aria-invalid="false"
        // > Close HTML Tag




        //2. Find the Password input and enter Password.

        //3. Find submit button and click on it.

        //4. Find the invalid error msg and verify.


    }
}

