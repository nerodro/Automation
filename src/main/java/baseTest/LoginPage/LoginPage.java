package baseTest.LoginPage;

import baseTest.BankPage.BankPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class LoginPage {
    private SelenideElement dropDownUsers = $(By.xpath("//select[@name=\"userSelect\"]"));
    private ElementsCollection HarryPotterButton = $$x("//option[@ng-repeat=\"cust in Customers\"]");
    private SelenideElement LoginButton = $(By.xpath("//button[@ng-show=\"custId != ''\"]"));


    public LoginPage ClickOnDropdown(){
        dropDownUsers.click();
        return this;
    }
    public LoginPage SelectUserInDropDown(String name){
        HarryPotterButton.filterBy(text(name)).first().click();
        return this;
    }
    public LoginPage SelectUserInDropDown(){
        HarryPotterButton.filterBy(text("Harry Potter")).first().click();
        return this;
    }
    public LoginPage assertUserInDropDown(String name){
        Assert.assertTrue(HarryPotterButton.filterBy(text(name)).first().exists());
        return this;
    }
    public BankPage LoginClick(){
        LoginButton.click();
        return new BankPage();
    }
}
