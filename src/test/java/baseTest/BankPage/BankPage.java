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
    private SelenideElement article = $(By.xpath("//label"));
    private SelenideElement Article = $(By.xpath("//label"));
    private SelenideElement InputField = $(By.xpath("//input"));
    private SelenideElement MakeActionButton = $(By.xpath("//button[@class=\"btn btn-default\"]"));
    private SelenideElement BalanceField = $(By.xpath("//strong[@class=\"ng-binding\"][2]"));
    public BankPage fillDeposit(){
        int fibInt = getIntFib();
        DepositButton.click();
        Article.should(text("Amount to be Deposited :"));
        InputField.click();
        InputField.sendKeys(Integer.toString(fibInt));
        MakeActionButton.click();
        String balance = BalanceField.getText();
        Assert.assertEquals(Integer.toString(fibInt), balance);
        return this;
    }
    public BankPage fillWithdrawl(){
        int fibInt = getIntFib();
        WithdrawlButton.click();
        Article.should(text("Amount to be Withdrawn :"));
        InputField.click();
        InputField.sendKeys(Integer.toString(fibInt));
        MakeActionButton.click();
        return this;
    }
    public  BankPage assertBalance(String balance){
        String textBalance = BalanceField.getText();
        Assert.assertEquals(balance, textBalance);
        return this;
    }
    private int getIntFib(){
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
