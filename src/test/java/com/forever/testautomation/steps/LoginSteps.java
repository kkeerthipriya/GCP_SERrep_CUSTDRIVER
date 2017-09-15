package com.forever.testautomation.steps;

import com.forever.testautomation.hooks.BrowserHooks;
import com.forever.testautomation.pageobjects.GiftCardDetails;
import com.forever.testautomation.pageobjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static com.forever.testautomation.hooks.BrowserHooks.driver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Keerthi Parepalli on 8/5/2017.
 */
public class LoginSteps {

    public LoginSteps() {
        driver = driver;
    }
    public void openBrowser() {
        driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS) ;
        driver.get("https://mono.forevernew.com.au/");
    }

    public void enterLoginDetails(String name,String pass){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        WebElement we=loginPage.login;
        if(we !=null){
            we.click();
        }
        we=loginPage.uname;
        we.sendKeys(name);
        we=loginPage.pwd;
        we.sendKeys(pass);
        we=loginPage.logn;
        we.click();
    }

}


