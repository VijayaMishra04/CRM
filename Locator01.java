package com.vijaya.Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
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

            //With ID Locators
        WebElement email = driver.findElement(By.id("email_id"));//(30 Dec - 32:44)
        email.sendKeys("admin@admin.com");
        Thread.sleep(10000);

        //2. Find the Password input and enter Password.
//      <input
//      type="password"
//      name="password"
//      id="password"
//      class="form-control"
//      placeholder="Enter Your Password"
//      onkeypress="return console.log(event.keyCode || event.which),(event.keyCode != 32 &amp;&amp; event.which != 32)"
//      style="padding: 1.2rem !important;"
//      oninput="inputfun()" >

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456");
        Thread.sleep(10000);

        //3. Find Login button and click on it.
        //<button
        // type="submit"
        // id="btn_login"
        // class="btn dark-bg py-3 btn-block"
        // style="font-size:14px;
        // font-weight:600;">
        // LOGIN
        // </button>

        WebElement login = driver.findElement(By.id("btn_login"));
        login.click();
        Thread.sleep(10000);

        //4. Find the invalid error msg and verify.
        //<h2
        // class="swal2-title"
        // id="swal2-title"
        // style="display: block;"
        // >Invalid User Name
        // </h2>

        WebElement error_msg = driver.findElement(By.className("swal2-title"));
        Assert.assertEquals(error_msg.getText(),"Invalid User Name"); //Invalid Credentials should display
//        WebElement ErrorMSG = driver.findElement(By.id("swal2-title")); // We can use class , and ID as well

        driver.quit();




    }
}

