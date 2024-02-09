package pages.Bank.general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class BankPage extends BasePage {
    public BankPage(WebDriver driver){
        super(driver);
    }
    By DepositButton = By.xpath("//button[@ng-click=\"deposit()\"]");
    By WithdrawlButton = By.xpath("//button[@ng-click=\"withdrawl()\"]");
    By TransactionsButton = By.xpath("ng-click=\"transactions()\"");
    By InputField = By.xpath("//input");
    By MakeActionButton = By.xpath("//button[@class=\"btn btn-default\"]");
    By BalanceField = By.xpath("//strong[@class=\"ng-binding\"][2]");
}
