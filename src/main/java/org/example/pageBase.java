package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

public class pageBase {
    protected WebDriver driver;

    public pageBase (WebDriver driver)
    {
        this.driver = driver;
    }


    public static void clicking(WebElement element)
    {
        element.click();
    }
    public static void enterText(WebElement element, String text)
    {
        element.sendKeys(text);
    }


}
