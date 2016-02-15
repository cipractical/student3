package features.Calculator;

import calculator.GoogleCalculator;

public class GoogleCalculatorTestStep 
{
	GoogleCalculator myCalc;
	
	public void launchGoogleCalculator() {
		myCalc = new GoogleCalculator();
	}
	
	public void submitEquation (String equation ) {
		myCalc.submitEquation(equation);
	}
	
	public String getResult() {
		return myCalc.getResult();
	}
}