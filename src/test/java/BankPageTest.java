import baseTest.BankPage.BankPage;
import baseTest.BaseTest;
import baseTest.LoginPage.LoginPage;
import org.testng.annotations.Test;

public class BankPageTest extends BaseTest {
    @Test
    public void Login(){
        LoginPage loginPage = new LoginPage();
        BankPage bankPage = new BankPage();
        loginPage
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .SelectUserInDropDown()
                .LoginClick();
        bankPage
                .fillDeposit()
                .fillWithdrawl()
                .assertBalance("0");
    }
}
