package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;

public class homePage extends pageBase {
    public homePage(WebDriver driver) {
        super(driver);
    }

    WebElement registerButton = driver.findElement(By.xpath("//a[@class='ico-register']"));
    WebElement loginButton = driver.findElement(By.xpath("//a[@class='ico-login']"));
    public registerPage clickOnRegisterButton() {
        clicking(registerButton);
        return new registerPage(driver);
    }
    public loginPage clickOnLoginButton() {
        clicking(loginButton);
        return new loginPage(driver);
    }


}



