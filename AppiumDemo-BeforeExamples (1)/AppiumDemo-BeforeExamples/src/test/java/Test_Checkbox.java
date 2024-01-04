import Pages.CheckBoxPage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Checkbox extends BaseTest{
    @Test
    public void testCheckBox() {
        // Navigate to Access'ibility , Accessibility Node Querying , click on any checkbox and validate that the checkbox is checked
        new HomePage(driver).enterAccessi_bility()
                .enterAccessibility_Node_Querying()
                .clickCheckBox();

        String expected = new CheckBoxPage(driver).value();
        Assert.assertTrue(expected.equals("true"));


        //Assert.assertTrue(checking.getAttribute("checked").equals("true") ); // || checking.isSelected()
        //Assert.assertTrue(driver.findElement(By.xpath("(//android.widget.CheckBox[@resource-id=\"io.appium.android.apis:id/tasklist_finished\"])[5]")).isEnabled());
    }
}