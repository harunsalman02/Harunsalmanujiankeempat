package com.juaracoding;

import com.juaracoding.AppCalculator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AppCalculator {

    public AndroidDriver<MobileElement> driver;

    public AppCalculator(AndroidDriver<MobileElement> driver){
      this.driver = driver;
      PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    private MobileElement btnSatu;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    private MobileElement btnDua;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    private MobileElement btnTambah;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_multiply'")
    private MobileElement btnperkalian;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_subtract")
    private MobileElement btnpengurangan;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_divide")
    private MobileElement btnpembagian;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    private MobileElement btnSamaDengan;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    private MobileElement hasil;
    public void calAdd() {
        btnSatu.click();
        btnTambah.click();
        btnperkalian.click();
        btnpengurangan.click();
        btnpembagian.click();
        btnDua.click();
        btnSamaDengan.click();
    }

    //
    public String getTxtResult() {
        return hasil.getText();
    }

}
