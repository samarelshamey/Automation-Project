package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage extends pageBase {
    private WebElement emailText = driver.findElement(By.xpath("//input[@id='Email']"));
    private WebElement passwordText = driver.findElement(By.xpath("//input[@id='Password']"));
    private WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));

    public loginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        enterText(emailText, email);
    }
    public void enterPassword(String pass) {
        enterText(passwordText, pass);
    }
    public void clickOnLoginButton(){
        clicking(loginButton);
    }
}
