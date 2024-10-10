package utilities;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;



public class Hooks {

    @BeforeAll
    public static void beforeAll() {
    }

    @Before // Buradaki Before BeforeScenario demek. (backround gibi düsünebiliriz)
    public void before() {
        DriverFactory.setDriver();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After // Buradaki After AfterScenario demek
    public void after()  {
        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void afterAll() {
    }
}
