package baseTest.Manager;

import baseTest.HomePage.HomePage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class ManagerPage {
    private SelenideElement addCustomerButton = $(By.xpath("//button[@ng-click=\"addCust()\"]"));
    private SelenideElement openAccountButton = $(By.xpath("//button[@ng-click=\"openAccount()\"]"));
    private SelenideElement listCustomersButton = $(By.xpath("//button[@ng-click=\"showCust()\"]"));
    private SelenideElement firstNameInput = $(By.xpath("//input[@placeholder=\"First Name\"]"));
    private SelenideElement lastNameInput = $(By.xpath("//input[@placeholder=\"Last Name\"]"));
    private SelenideElement postCodeInput = $(By.xpath("//input[@placeholder=\"Post Code\"]"));
    private SelenideElement createNewCustomerButton = $(By.xpath("//button[text()='Add Customer']"));
    private SelenideElement firstNameColumn = $(By.xpath("//a[@ng-click=\"sortType = 'fName'; sortReverse = !sortReverse\"]"));
    private ElementsCollection listFirstNames = $$x("//td[@class=\"ng-binding\"][1]");
    private ElementsCollection listLastNames = $$x("//td[@class=\"ng-binding\"][2]");
    private ElementsCollection listPostCodes = $$x("//td[@class=\"ng-binding\"][3]");
    private SelenideElement homeButton = $(By.xpath("//button[@ng-click=\"home()\"]"));

    public ManagerPage addCustomerClick(){
        addCustomerButton.click();
        return this;
    }
    public ManagerPage fillFirstName(String name){
        firstNameInput.setValue(name);
        return this;
    }
    public ManagerPage fillLastName(String name){
        lastNameInput.setValue(name);
        return this;
    }
    public ManagerPage fillPostCode(String code){
        postCodeInput.setValue(code);
        return this;
    }
    public ManagerPage createNewCustomerClick(){
        createNewCustomerButton.click();
        return this;
    }
    public ManagerPage listCustomersClick(){
        listCustomersButton.click();
        return this;
    }
    public HomePage homeButtonClick(){
        homeButton.click();
        return new HomePage();
    }
    public ManagerPage assertCustomer(CustomerModel model){
        firstNameColumn.click();
        firstNameColumn.sendKeys(Keys.PAGE_DOWN);
        Assert.assertTrue(listFirstNames.filterBy(text(model.firstName)).first().exists());
        Assert.assertTrue(listLastNames.filterBy(text(model.lastName)).first().exists());
        Assert.assertTrue(listPostCodes.filterBy(text(model.postCode)).first().exists());
        return this;
    }
}
