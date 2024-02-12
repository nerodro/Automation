package baseTest.BankPage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.LocalDate;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class BankPage {
    private SelenideElement DepositButton = $(By.xpath("//button[@ng-click=\"deposit()\"]"));
    private SelenideElement WithdrawlButton = $(By.xpath("//button[@ng-click=\"withdrawl()\"]"));
    private SelenideElement TransactionsButton = $(By.xpath("ng-click=\"transactions()\""));
    private SelenideElement SuccesfullOpetation = $(By.xpath("//span[@ng-show=\"message\"]"));
    private SelenideElement article = $(By.xpath("//label"));
    private SelenideElement Article = $(By.xpath("//label"));
    private SelenideElement InputField = $(By.xpath("//input"));
    private SelenideElement MakeActionButton = $(By.xpath("//button[@class=\"btn btn-default\"]"));
    private SelenideElement BalanceField = $(By.xpath("//strong[@class=\"ng-binding\"][2]"));
    public BankPage fillDeposit(int fibInt){
        DepositButton.click();
        Article.should(text("Amount to be Deposited :"));
        InputField.click();
        InputField.sendKeys(Integer.toString(fibInt));
        MakeActionButton.click();
        return this;
    }
    public BankPage fillWithdrawl(int fibInt){
        WithdrawlButton.click();
        Article.should(text("Amount to be Withdrawn :"));
        InputField.click();
        InputField.sendKeys(Integer.toString(fibInt));
        MakeActionButton.click();
        return this;
    }
    public  BankPage assertBalance(int balance){
        String textBalance = BalanceField.getText();
        Assert.assertEquals(Integer.toString(balance), textBalance);
        return this;
    }
    public BankPage assertSuccesDeposite(){
        SuccesfullOpetation.shouldHave(text("Deposit Successful"));
        return this;
    }
    public BankPage assertSuccesWithDrawl(){
        SuccesfullOpetation.shouldHave(text("Transaction successful"));
        return this;
    }
    public int getIntFib(){
        int a = 1;
        int b = 1;
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue() + 1;
        for (int i = 0; month > i; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
