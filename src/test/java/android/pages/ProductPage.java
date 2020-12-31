package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage {

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc='Checking Accounts']")
    private WebElement checkingAccountBtn;

    public void userOnProductPage() {
        Assert.assertTrue(checkingAccountBtn.isDisplayed());
        ExtentTestManager.log("user is on the product page");
    }

}
