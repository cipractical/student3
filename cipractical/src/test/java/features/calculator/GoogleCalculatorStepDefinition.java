package features.calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GoogleCalculatorStepDefinition 
{
	GoogleCalculatorTestStep myTester;
	
	@Given("^I open google$")
	public void i_open_google()  {
	    myTester = new GoogleCalculatorTestStep();
	    myTester.launchGoogleCalculator();
	}

	@When("^I enter \"([^\"]*)\" in search textbox$")
	public void i_enter_in_search_textbox(String equation)  {
		myTester.submitEquation(equation);
	}

	@Then("^I should get result as \"([^\"]*)\"$")
	public void i_should_get_result_as(String arg1 )  {
		String actualResult = myTester.getResult();
		Assert.assertEquals(arg1, actualResult);
	}

}
