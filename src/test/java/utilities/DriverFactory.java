package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {
    static AndroidDriver driver;

    public static void setDriver() {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
//        options.setUdid("emulator-5554");

        options.setAppPackage("trendyol.com");
        options.setAppActivity("com.trendyol.common.splash.impl.ui.SplashActivity");
        options.setNoReset(false);
        try {
            driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), options);
        } catch (MalformedURLException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // kadın button click
        // kampanya page
        // popup kapat
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}
