package android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageTransfersPage {

    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    private WebElement userNameTab;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    private WebElement passwordTab;

    public void ProvideUserName() {
        userNameTab.sendKeys("Lyes");
    }

    public void ProvidePassword() {
        passwordTab.sendKeys("123456");
    }

}
