package baseTest.HomePage;

import baseTest.LoginPage.LoginPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement customer_login = $(By.xpath("//button[@ng-click=\"customer()\"]"));
    public HomePage ClickOnCustomerLogin(){
        customer_login.click();
        return this;
    }
}
