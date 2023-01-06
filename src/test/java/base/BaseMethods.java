package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseMethods extends DriverFactory{

    protected WebDriverWait wait;

    public BaseMethods() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitAndClickElement(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (Exception e) {
            System.out.println("No fue posible la acción click and wait");
        }
    }

    public void clickOnTextFromDropdownList(WebElement list, String textToSearch) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(list)).click();
            list.sendKeys(textToSearch);
            list.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            System.out.println("No fue posible seleccioar en dropdown");
        }
    }



}
