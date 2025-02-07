package com.vijaya.SeleniumBasics02;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PracticeBasics03 {
   @Description("Open browser https://sellxpert.in/ and get title")
    @Test
    public static void main(String[] args){
       EdgeDriver driver = new EdgeDriver();
       driver.get("https://sellxpert.in/");
       System.out.println(driver.getTitle());
       driver.quit();
   }
}
