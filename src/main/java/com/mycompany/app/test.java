package com.mycompany.app;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class test {
	int  totalNumberOfApplicants = 0;
	@Given("today is Sunday")
	public void today_is_Sunday() {
		
		assertTrue(totalNumberOfApplicants == 0);
	}
	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
		assertTrue(totalNumberOfApplicants == 0);
	}
	
	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
		assertTrue(totalNumberOfApplicants == 0);
	}
}