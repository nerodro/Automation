import baseTest.BankPage.BankPage;
import baseTest.BaseTest;
import baseTest.HomePage.HomePage;
import org.testng.annotations.Test;

public class BankPageTest extends BaseTest {
    @Test
    public void TestDeposite(){
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
