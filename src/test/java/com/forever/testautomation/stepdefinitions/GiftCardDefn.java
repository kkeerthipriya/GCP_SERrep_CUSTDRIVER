package com.forever.testautomation.stepdefinitions;

import com.forever.testautomation.steps.LoginSteps;
import com.forever.testautomation.steps.NewGiftCardSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.*;

/**
 * Created by Keerthi Parepalli on 8/5/2017.
 */
public class GiftCardDefn {

    /* public WebDriver driver;
     public AuthStepDefn(){
         driver = BrowserHooks.driver;
     }*/
    NewGiftCardSteps giftcard = new NewGiftCardSteps();
    LoginSteps loginSteps=new LoginSteps();


//Purchase a gift card
    @Given("^I open the Forever New home page '(.*)' and '(.*)'$")

    public void i_open_the_Forever_Page(String uname,String pwd) throws Throwable {
          loginSteps.openBrowser();
          loginSteps.enterLoginDetails(uname,pwd);
    }

    @When("^I open buy gift cards page$")
    public void i_open_gift_card_Page() throws Throwable {
        giftcard.goToGiftCardPage();
    }

    @And("^give all the details '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)'$")

    public void i_give_all_giftCard_details(String GiftCardValue,String QTY, String SenName,String SenEmail,String RcvName,String RcvEmail,String Msg,String CreditCardNo,String ExpMon,String Expyr,String CVV) throws Throwable {
        giftcard.enterGiftCardDetails(GiftCardValue,QTY,SenName,SenEmail,RcvName,RcvEmail,Msg,CreditCardNo,ExpMon,Expyr,CVV);
    }

    @Then("^I should login to the forever new website$")
    public void i_should_not_be_able_to_go_to_next_page() throws Throwable {

    }

//incorrect email id -- test fail assertion

    @Given("^I open the Forever New page '(.*)' and '(.*)'$")

    public void i_open_the_Forever_Page2(String uname,String pwd) throws Throwable {
        loginSteps.openBrowser();
        loginSteps.enterLoginDetails(uname,pwd);
    }

    @When("^I open gift cards page$")
    public void i_open_gift_card_Page2() throws Throwable {
        giftcard.goToGiftCardPage();
    }

    @And("^give all the details with invalid email id '(.*)' and '(.*)' and '(.*)' and '(.*)'$")

    public void i_give_all_giftCard_details2(String GiftCardValue,String QTY, String SenName,String SenEmail) throws Throwable {
        giftcard.enterGiftCardDetails2(GiftCardValue,QTY,SenName,SenEmail);
    }

    @Then("^I should not be able to go ahead with purchasing and should throw an error message$")
    public void i_should_not_be_able_to_go_to_next_page2() throws Throwable {

    }






}










