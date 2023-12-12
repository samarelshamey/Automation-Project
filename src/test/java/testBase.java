import org.example.homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testBase {
    protected WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }


   /*@AfterTest
    public void closeBrowser() {
        driver.quit();
    }*/
}
