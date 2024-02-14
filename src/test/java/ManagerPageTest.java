import baseTest.BaseTest;
import baseTest.HomePage.HomePage;
import baseTest.Manager.CustomerModel;
import org.testng.annotations.Test;

public class ManagerPageTest extends BaseTest {
    @Test
    public void createNewCustomer(){
        CustomerModel model = CustomerModel.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .postCode("1234").build();

        new HomePage()
                .clickOnMangagerLogin()
                .addCustomerClick()
                .fillFirstName(model.firstName)
                .fillLastName(model.lastName)
                .fillPostCode(model.postCode)
                .createNewCustomerClick()
                .listCustomersClick()
                .assertCustomer(model);
    }
    @Test
    public void checkNewCustomerInDropDown(){
        CustomerModel model = CustomerModel.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .postCode("1234").build();

        new HomePage()
                .clickOnMangagerLogin()
                .addCustomerClick()
                .fillFirstName(model.firstName)
                .fillLastName(model.lastName)
                .fillPostCode(model.postCode)
                .createNewCustomerClick()
                .homeButtonClick()
                .ClickOnCustomerLogin()
                .ClickOnDropdown()
                .assertUserInDropDown(model.firstName+ " " + model.lastName);
    }
}
