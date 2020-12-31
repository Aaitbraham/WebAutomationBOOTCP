package android.pages;

import com.pnt.mobileautomation.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsBtn;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMoneyBtn;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payAbillBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Manage Transfers']")
    private WebElement manageTransfersBt;

    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement productsBtn;


    public void clickOnProducts() {
        productsBtn.click();
        ExtentTestManager.log("clicked on product");
    }

    public void clickOnAccountsButton() {
        accountsBtn.click();
    }

    public void clickOnPayAbillButton() {
        payAbillBtn.click();
    }

    public void clickOnDepositBtton() {
        depositBtn.click();
    }

    public void clickOnTransferButton() {
        transferBtn.click();
    }

    public void clickOnSendMoneyButton() {
        sendMoneyBtn.click();
    }

    public void clickOnManageTransfersButton() {
        manageTransfersBt.click();

    }

}
