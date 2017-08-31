package com.forever.testautomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Keerthi Parepalli on 6/5/2017.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/GiftCard.feature",
        plugin = {"pretty", "html:target/cucumber-html-report"}

        //tags = "@Authorization"

)
public class RunnerTest {

}
