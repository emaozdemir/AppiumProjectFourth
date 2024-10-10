package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import utilities.ReusableMethods;

public class HomePage {

    AndroidDriver driver;
    ReusableMethods methods;

    public HomePage(AndroidDriver androidDriver){
        driver = androidDriver;
        methods = new ReusableMethods(driver);
    }

    By alarmButton = By.id("trendyol.com:id/imageViewNotificationBell");
    By trendyolLogo = By.id("trendyol.com:id/imageview_trendyol_logo");

    By homeSembolButton = By.xpath("(//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageViewIcon\"])[1]");


    public void verifyHomePageIsDisplayed() {
        methods.checkElement(trendyolLogo);
    }

    public void shouldSeeHomeSembolButton() {
        methods.checkElement(homeSembolButton);
    }

    public void shouldSeeAlarmButtonOnHomePage() {
        methods.checkElement(alarmButton);
    }

    public void verifyTrendyolLogoIsDisplayed() {
        methods.checkElement(trendyolLogo);
    }
}
