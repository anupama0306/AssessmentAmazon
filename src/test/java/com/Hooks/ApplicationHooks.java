package com.Hooks;

import com.factory.DriverFactory;
import com.pages.ProductPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Properties;

public class ApplicationHooks {
    protected WebDriver driver;
    protected Properties prop;
    DriverFactory df;
    protected ProductPage productPage;
    @Before(order = 0)
    public void setUp(){
        df = new DriverFactory();
        prop = df.initProp();

       driver =  df.init_Driver(prop);
       productPage = new ProductPage(driver);

    }
    @After(order = 1)
    public void quitBrowser() {
        driver.quit();
    }

    @After(order = 0)
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            // take scenreenshot
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] srcPath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(srcPath, "image/png", screenshotName);
        }
    }
}
