package com.forever.testautomation.steps;

import com.forever.testautomation.hooks.BrowserHooks;
import com.forever.testautomation.pageobjects.GiftCardDetails;
import com.forever.testautomation.pageobjects.LoginPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.forever.testautomation.hooks.BrowserHooks.driver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Keerthi Parepalli on 8/5/2017.
 */
public class NewGiftCardSteps {

    public NewGiftCardSteps() {
        driver = driver;
    }

    public void openBrowser() {
        driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS) ;
        driver.get("https://mono.forevernew.com.au/");
    }

    public void goToGiftCardPage(){
        GiftCardDetails giftcardpage = PageFactory.initElements(driver, GiftCardDetails.class);
        WebElement we=giftcardpage.giftCards;
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy(0,950)", "");
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        if(we !=null){
            we.click();
        }
    }
/* This method is for Gift card purchase*/
    public void enterGiftCardDetails(String GiftCardValue,String QTY, String SenName,String SenEmail,String RcvName,String RcvEmail,String Msg, String CreditCardNo,String ExpMonth,String ExpYr,String cvv){

        GiftCardDetails giftcardpage = PageFactory.initElements(driver, GiftCardDetails.class);

        WebElement we=giftcardpage.selectVal;
        Select amount=new Select(we);
       // amount.selectByIndex(3);
         amount.selectByVisibleText(GiftCardValue);

        we=giftcardpage.quantity;
        Select qty=new Select(we);
        qty.selectByVisibleText(QTY);

        giftcardpage.senderName.sendKeys(SenName);
        giftcardpage.senderEmail.sendKeys(SenEmail);
       // String incorrectEmailErrTxt="Please enter a valid email adress. For example johndoe@domain.com.";
        //giftcardpage.senderEmail.sendKeys(Keys.TAB);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace();
        }

        giftcardpage.confSendEmail.sendKeys(SenEmail);
        giftcardpage.recName.sendKeys(RcvName);
        giftcardpage.recEmail.sendKeys(RcvEmail);
        giftcardpage.confRecEmail.sendKeys(RcvEmail);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        giftcardpage.message.sendKeys(Msg);
        giftcardpage.addToCart.submit();

        giftcardpage.proceedCheckOut.click();

        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        driver.switchTo().frame(driver.findElement(By.name("braintree-hosted-field-number")));
      //  driver.switchTo().frame(driver.findElement(By.id("credit-card-number")));
        giftcardpage.creditCardNum.sendKeys(CreditCardNo);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.name("braintree-hosted-field-expirationMonth")));
        giftcardpage.expMonth.sendKeys(ExpMonth);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.name("braintree-hosted-field-expirationYear")));
        giftcardpage.expYear.sendKeys(ExpYr);
        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.name("braintree-hosted-field-cvv")));
        giftcardpage.cvvNo.sendKeys(cvv);
        driver.switchTo().defaultContent();

        giftcardpage.paySecurely.click();


        try{
            Thread.sleep(5000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace();
        }

        giftcardpage.verifyTC.click();
        giftcardpage.submitOrder.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace();
        }

    }

    /* This method is for GC Purchase-Incorrect email id */

    public void enterGiftCardDetails2(String GiftCardValue,String QTY, String SenName,String SenEmail){

        GiftCardDetails giftcardpage = PageFactory.initElements(driver, GiftCardDetails.class);

        WebElement we=giftcardpage.selectVal;
        Select amount=new Select(we);
        // amount.selectByIndex(3);
        amount.selectByVisibleText(GiftCardValue);

        we=giftcardpage.quantity;
        Select qty=new Select(we);
        qty.selectByVisibleText(QTY);

        giftcardpage.senderName.sendKeys(SenName);
        giftcardpage.senderEmail.sendKeys(SenEmail);
        String incorrectEmailErrTxt="Please enter a valid email adress. For example johndoe@domain.com.";
        giftcardpage.senderEmail.sendKeys(Keys.TAB);
        String ErrorMessage=giftcardpage.EmailErrText.getText();
        assertThat(ErrorMessage).isEqualTo(incorrectEmailErrTxt);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException ie1) {
            ie1.printStackTrace();
        }


    }


}


