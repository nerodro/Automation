import baseTest.BankPage.BankPage;
import baseTest.BaseTest;
import baseTest.LoginPage.LoginPage;
import org.testng.annotations.Test;

public class BankPageTest extends BaseTest {
    @Test
    public void TestDeposite(){
        LoginPage loginPage = new LoginPage();
        BankPage bankPage = new BankPage();
        int fibInt = bankPage.getIntFib();
        loginPage
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .SelectUserInDropDown()
                .LoginClick();
        bankPage
                .fillDeposit(fibInt)
                .assertBalance(fibInt);
    }
    @Test
    public void TestWithdraw(){
        LoginPage loginPage = new LoginPage();
        BankPage bankPage = new BankPage();
        int fibInt = bankPage.getIntFib();
        loginPage
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .SelectUserInDropDown()
                .LoginClick();
        bankPage
                .fillDeposit(fibInt)
                .fillWithdrawl(fibInt)
                .assertBalance(0);
    }
}
