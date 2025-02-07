package com.vijaya.SeleniumBasics01;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumBasics02 {
    @Description("Open https://sellxpert.in and get title ")
    @Test
    public static void main(String[] args) {
    //Open URL
    // Print the title
        EdgeDriver driver = new EdgeDriver();

    // new EdgeDriver(); -> POST Request (localhost:50028), Creates Session Endpoint
    //-> This Started edge real browser

    driver.get("https://sellxpert.in");
    System.out.println(driver.getTitle());
    }
}
