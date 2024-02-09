package pages.Bank.general;

import com.codeborne.selenide.commands.ToString;
import org.joda.time.DateTime;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;

public class BankPageActions  extends BankPage {

    public BankPageActions(WebDriver driver) {
        super(driver);
    }
    public BankPageActions fillDepositButton(){
        int fibInt = getIntFib();
        _driver.findElement(DepositButton).click();
        _driver.findElement(InputField).click();
        _driver.findElement(InputField).sendKeys(Integer.toString(fibInt));
        _driver.findElement(MakeActionButton).click();
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
