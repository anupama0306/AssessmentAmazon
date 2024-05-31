package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.util.ElementUtil;
import com.constants.AppConstants;
import java.util.List;

public class ProductPage {
    private WebDriver driver;
    private By homeLogo = By.xpath("//a[@id='nav-logo-sprites']");
    private By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    private By SearchButton = By.xpath("//input[@id='nav-search-submit-button']");
    ElementUtil elementUtil;


    public ProductPage(WebDriver driver) {


        this.driver = driver;
        elementUtil = new ElementUtil(this.driver);

    }

    public Boolean checkHomeLogoExist() throws InterruptedException {

        return (elementUtil.waitForVisibilityOfElement(homeLogo, AppConstants.POLLING_DEFAULT_WAIT).isDisplayed());


    }

}
