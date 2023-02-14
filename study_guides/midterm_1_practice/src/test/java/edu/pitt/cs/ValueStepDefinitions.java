package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	// TODO: Fill in!
	Value value;

	@Given("a Value")
	public void aValue() {
		value = new Value();
	}

	@When("I call getVal")
	public int iCallGetVal() {
		return value.getVal();
	}

	@When("I call incVal")
	public void iCallIncVal() {
		value.incVal();
	}

	@Then("the value is: {int}")
	public void theValueIs(int result)
	{
		assertEquals("the results are not equal", value.getVal(), result);
	}
}
