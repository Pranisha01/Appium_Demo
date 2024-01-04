package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
    WebDriver driver;

    public CheckBoxPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By checkBox = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[5]");

    By checking = By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[5]");
    public void clickCheckBox(){
        driver.findElement(checkBox).click();
    }

    public String value(){
        return driver.findElement(checking).getAttribute("checked");
    }
}
