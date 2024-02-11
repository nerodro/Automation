import baseTest.BaseTest;
import baseTest.HomePage.HomePage;
import baseTest.Manager.ManagerPage;
import org.testng.annotations.Test;

public class ManagerPageTest extends BaseTest {
    @Test
    public void createNewCustomer(){
        new HomePage()
                .clickOnMangagerLogin()
                .addCustomerClick()
                .fillFirstName("Test")
                .fillLastName("Test")
                .fillPostCode("123")
                .createNewCustomerClick();
    }
}
