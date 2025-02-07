package com.vijaya.SeleniumBasics01;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
@Test
public static void main(String[] args) {
    EdgeDriver driver = new EdgeDriver();
    driver.get("https://sellxpert.in/");
    System.out.println(driver.getTitle());
    driver.quit();
}
}
