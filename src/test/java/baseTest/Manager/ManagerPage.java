package baseTest.Manager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ManagerPage {
    private SelenideElement addCustomerButton = $(By.xpath("//button[@ng-click=\"addCust()\"]"));
    private SelenideElement openAccountButton = $(By.xpath("//button[@ng-click=\"openAccount()\"]"));
    private SelenideElement listCustomersButton = $(By.xpath("//button[@ng-click=\"showCust()\"]"));
    private SelenideElement firstNameInput = $(By.xpath("//input[@placeholder=\"First Name\"]"));
    private SelenideElement lastNameInput = $(By.xpath("//input[@placeholder=\"Last Name\"]"));
    private SelenideElement postCodeInput = $(By.xpath("//input[@placeholder=\"Post Code\"]"));
    private SelenideElement createNewCustomerButton = $(By.xpath("//button[text()='Add Customer']"));
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
}
