import org.example.homePage;
import org.example.loginPage;
import org.example.registerPage;
import org.testng.annotations.Test;

public class registerPageTest extends testBase{
    private homePage homePage;
    private registerPage registerPage;
    @Test
    public void validRegisterTest() {
        homePage = new homePage(driver);
        registerPage= homePage.clickOnRegisterButton();
        registerPage.selectGender();
        registerPage.enterFirstName("samar");
        registerPage.enterLastName("elshamey");
        registerPage.enterEmail("smsmelshamey90@gmail.con");
        registerPage.enterPassword("1234567");
        registerPage.enterRePassword("1234567");
        registerPage.clickOnRegisterButton();



    }
}
