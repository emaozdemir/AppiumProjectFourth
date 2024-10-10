package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.ReusableMethods;

public class GenderPage {

    AndroidDriver driver;
    ReusableMethods methods;

    public GenderPage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By menButton = By.id("trendyol.com:id/buttonMen");
    By womenButton = By.id("trendyol.com:id/buttonWomen");
    By textHeadline = By.id("trendyol.com:id/textViewHeadline");
    By closeButton = By.id("trendyol.com:id/imageViewClose");
    By gerderImage = By.xpath("//android.widget.FrameLayout[@resource-id=\"trendyol.com:id/fragmentContainerViewInternational\"]/android.view.ViewGroup/android.widget.ImageView[2]");
    // By gerderImage = By.id("trendyol.com:id/backgroundTopHalf");


    public void checkGerderPage() {
//        methods.checkElement(menButton);
//        methods.checkElement(womenButton);
        methods.checkElement(textHeadline);
//        methods.checkElement(closeButton);
//        methods.checkElement(gerderImage);
    }

    public void shouldSeeImageOnGenderPage() {
        methods.checkElement(gerderImage);
    }

    public void shouldSeeCloseButtonOnGenderPage() {
        methods.checkElement(closeButton);
    }


    public void checkMenButtonText(String menText) {
        Assert.assertEquals(methods.getText(menButton),menText);
    }

    public void checkWomenButtonText(String womenText) {
        Assert.assertEquals(methods.getText(womenButton),womenText);
    }

    public void checkTextButtonTextOnGenderPage(String text) {
        Assert.assertEquals(methods.getText(textHeadline), text);
    }

    public void clickMenButton() {
        methods.click(menButton);
    }

    public void clickWomenButton() {
        methods.click(womenButton);
    }

    public void clickCloseButtonOnGenderPage() {
        methods.click(closeButton);
    }
}
