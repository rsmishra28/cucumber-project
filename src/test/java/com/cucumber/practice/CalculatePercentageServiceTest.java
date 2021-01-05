package com.cucumber.practice;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CalculatePercentageServiceTest {

    CalculatePercentageService percentageService ;
    String percent ;

    @Before("@First , @Second")
    public void setUp(){
        System.out.println("Called Before");
    }

    @After("@Second")
    public void tearDown(){
        System.out.println("Called After");
    }

    @Given("^Percent calc service$")
    public void percent_calculater_service() throws Throwable {
        System.out.println("percent_calculater_service");
        percentageService = new CalculatePercentageService();
    }

    @When("^I will enter amount (\\d+)$")
    public void i_will_enter_amount(int price) throws Throwable {
        System.out.println("i_will_enter_amount");
        percent = percentageService.getDiscountOffer(price);
    }

    @Then("^Offer is ten percent$")
    public void offer_is_ten_percent(){
        Assert.assertEquals("10%",percent);
    }

    @Then("^Offer is fifteen percent$")
    public void offer_is_fifteen_percent()  {
        Assert.assertEquals("15%",percent);
    }

    @Then("^Offer is NA$")
    public void offerIsNA() {
        Assert.assertEquals("DA",percent);
    }

   /*

    @Given("^Percent calculater service$")
    public void percent_calculater_service() {
        percentageService = new CalculatePercentageService();
    }

    @When("^I will enter amount (\\d+)$")
    public void i_will_enter_amount(int price) {
        percent = percentageService.getDiscountOffer(price);
    }

    @Then("^Offer is ten percent$")
    public void offer_is_ten_percent() {
        Assert.assertEquals(percent,"10%");
    }

    @Then("^Offer is fifteen percent$")
    public void offer_is_fifteen_percent() {
        Assert.assertEquals(percent,"15%");
    }*/
}
