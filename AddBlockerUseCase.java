package com.vijaya.Options_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class AddBlockerUseCase {
    @Description("Use cases for Add Blocker")
    @Test
    public void test_selenium01(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions("");
    }
}
