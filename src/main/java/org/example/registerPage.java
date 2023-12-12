package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage extends pageBase{

    public registerPage(WebDriver driver) {
        super(driver);
    }

    private WebElement selectFemaleGender = driver.findElement(By.xpath("//input[@id='gender-female']"));
    private WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
    private WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
    private WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
    private WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
    private WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));

    private WebElement registerButton = driver.findElement(By.xpath("//button[@id='register-button']"));

    public void selectGender()
    {
        clicking(selectFemaleGender);
    }
    public void enterFirstName(String fName) {
        enterText(firstName, fName);
    }public void enterLastName(String lName) {
        enterText(lastName, lName);
    }public void enterEmail(String mail) {
        enterText(email, mail);
    }public void enterPassword(String pass) {
        enterText(password, pass);
    }public void enterRePassword(String repass) {
        enterText(confirmPassword, repass);
    }public void clickOnRegisterButton() {
        clicking(registerButton);
    }

}
