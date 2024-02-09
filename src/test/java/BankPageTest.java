import baseTest.BaseTest;
import org.testng.annotations.Test;

import static constants.Constant.TimeOut.BankUrl;

public class BankPageTest extends BaseTest {
    @Test
    public void Login(){
        basePage.open(BankUrl);

        loginAction
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .SelectUserInDropDown()
                .LoginClick();
        bankPageActions.fillDepositButton();
    }
}
