package com.juaracoding;

import java.net.MalformedURLException;
import java.net.ConnectException;
import java.net.URL;

import com.juaracoding.TestAppCalculator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestAppCalculator {

    private static AndroidDriver<MobileElement> driver;

    private AppCalculator appCalculator;



    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel_2_API_25");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @BeforeMethod
    public void pageObject() {
        appCalculator = new AppCalculator(driver);
    }

    @Test
    public void testAdd() {
        appCalculator.calAdd();
        System.out.println("Hasil = "+appCalculator.getTxtResult());
        Assert.assertEquals(appCalculator.getTxtResult(), "3");
    }

    @Test
    public void testmultiply() {
        appCalculator.calAdd();
        System.out.println("Hasil = "+appCalculator.getTxtResult());
        Assert.assertEquals(appCalculator.getTxtResult(), "4");
    }

    @Test
    public void testsubtract() {
        appCalculator.calAdd();
        System.out.println("Hasil = "+appCalculator.getTxtResult());
        Assert.assertEquals(appCalculator.getTxtResult(), "5");
    }

    @Test
    public void testdivide() {
        appCalculator.calAdd();
        System.out.println("Hasil = "+appCalculator.getTxtResult());
        Assert.assertEquals(appCalculator.getTxtResult(), "6");
    }


    @AfterClass
    public void closeApp() {
        driver.quit();
    }



}
