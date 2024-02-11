package baseTest.LoginPage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static baseTest.Constant.base_Url;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class LoginPage {
    private SelenideElement dropDownUsers = $(By.xpath("//select[@name=\"userSelect\"]"));
    private ElementsCollection HarryPotterButton = $$x("//option[@ng-repeat=\"cust in Customers\"]");
    private SelenideElement LoginButton = $(By.xpath("//button[@ng-show=\"custId != ''\"]"));
    public LoginPage(){
        Selenide.open(base_Url);
    }

    public LoginPage ClickOnDropdown(){
        dropDownUsers.click();
        return this;
    }
    public LoginPage SelectUserInDropDown(String name){
        HarryPotterButton.filterBy(text(name)).first().click();
        return this;
    }
    public LoginPage LoginClick(){
        LoginButton.click();
        return this;
    }
}
