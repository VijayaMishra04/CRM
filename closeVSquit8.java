package com.vijaya.SeleniumBasics03;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class closeVSquit8 {
    @Description("Close vs Quit")
    @Test
    public void test_Selenium01() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sellxpert.in/");

        //Close -> it will close current tab only, not the session
        // session  id != null
//        Thread.sleep(3000);
//        driver.close();

        Thread.sleep(5000);
        driver.quit(); //Close all the tab - session id == null

    }
}
