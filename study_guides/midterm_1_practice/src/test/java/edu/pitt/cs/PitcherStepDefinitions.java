package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class PitcherStepDefinitions {
    Pitcher p;

	@Given("a Pitcher")
	public void aPitcher() {
		p = new Pitcher();
	}

	@When("I add {int} stress")
	public void iAddStress(int s) {
		p.addStress(s);
	}

	@Then("the stress is: {int}")
	public void theStressIs(int s)
	{
		assertEquals("the results are not equal", p.getStress(), s);
	}
}
