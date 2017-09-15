package com.forever.testautomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Keerthi Parepalli on 6/5/2017.
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/GiftCard.feature",
        plugin = {"pretty", "html:target/cucumber-html-report"},
      //  tags={"@Regression1","@Regression2"}
          tags={"@Regression1,@Regression3"}

)
public class RunnerTest {

}
