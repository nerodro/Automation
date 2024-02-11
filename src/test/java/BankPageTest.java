import baseTest.BankPage.BankPage;
import baseTest.BaseTest;
import baseTest.HomePage.HomePage;
import baseTest.LoginPage.LoginPage;
import org.testng.annotations.Test;

public class BankPageTest extends BaseTest {
    @Test
    public void TestDeposite(){
        LoginPage loginPage = new LoginPage();
        BankPage bankPage = new BankPage();
        HomePage homePage = new HomePage();
        int fibInt = bankPage.getIntFib();

        homePage.ClickOnCustomerLogin();
        loginPage
                .ClickOnDropdown()
                .SelectUserInDropDown("Harry Potter")
                .LoginClick();
        bankPage
                .fillDeposit(fibInt)
                .assertSuccesDeposite()
                .assertBalance(fibInt);
    }
    @Test
    public void TestWithdraw(){
        LoginPage loginPage = new LoginPage();
        BankPage bankPage = new BankPage();
        HomePage homePage = new HomePage();
        int fibInt = bankPage.getIntFib();

        homePage
                .ClickOnCustomerLogin();
        loginPage
                .ClickOnDropdown()
                .SelectUserInDropDown("Harry Potter")
                .LoginClick();
        bankPage
                .fillDeposit(fibInt)
                .fillWithdrawl(fibInt)
                .assertSuccesWithDrawl()
                .assertBalance(0);
    }
}
