import org.example.homePage;
import org.example.loginPage;
import org.testng.annotations.Test;

public class loginPageTest extends testBase{
    private homePage homePage;
    private loginPage login;

    @Test
    public void validLogin() {
        homePage = new homePage(driver);
        login = homePage.clickOnLoginButton();
        login.enterEmail("smsm@gmail.com");
        login.enterPassword("123456");
        login.clickOnLoginButton();


    }

}
