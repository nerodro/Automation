import baseTest.BankPage.BankPage;
import baseTest.BaseTest;
import baseTest.HomePage.HomePage;
import baseTest.LoginPage.LoginPage;
import org.testng.annotations.Test;

public class BankPageTest extends BaseTest {
    @Test
    public void TestDeposite(){
        new LoginPage();
        int fibInt = new BankPage().getIntFib();

        new HomePage()
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .SelectUserInDropDown("Harry Potter")
                .LoginClick()
                .fillDeposit(fibInt)
                .assertSuccesDeposite()
                .assertBalance(fibInt);
    }
    @Test
    public void TestWithdraw(){
        new LoginPage();
        int fibInt = new BankPage().getIntFib();

        new HomePage()
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .SelectUserInDropDown("Harry Potter")
                .LoginClick()
                .fillDeposit(fibInt)
                .fillWithdrawl(fibInt)
                .assertSuccesWithDrawl()
                .assertBalance(0);
    }
}
