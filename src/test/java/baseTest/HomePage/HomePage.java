package baseTest.HomePage;

import baseTest.LoginPage.LoginPage;
import baseTest.Manager.ManagerPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static baseTest.Constant.base_Url;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement customer_login = $(By.xpath("//button[@ng-click=\"customer()\"]"));
    private SelenideElement managerLogin = $(By.xpath("//button[@ng-click=\"manager()\"]"));
    public HomePage(){
        Selenide.open(base_Url);
    }
    public LoginPage ClickOnCustomerLogin(){
        customer_login.click();
        return new LoginPage();
    }
    public ManagerPage clickOnMangagerLogin(){
        managerLogin.click();
        return new ManagerPage();
    }
}
