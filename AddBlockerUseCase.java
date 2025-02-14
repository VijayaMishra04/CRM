package com.vijaya.Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class AddBlockerUseCase {
    @Description("Use cases for Add Blocker")
    @Test
    public void test_selenium01(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addExtensions(new File("src/test/java/com/vijaya/Options_Locators/adblocker.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
    }
}
