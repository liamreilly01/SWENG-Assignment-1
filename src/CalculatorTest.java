package src;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest 
{
	@Test
	public void testConstructor()
	{
		new Calculator();
	}

	@Test
	public void addWithOneDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "1+2";
		String answer = "3";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void subtractWithOneDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "2-1";
		String answer = "1";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void multiplyWithOneDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "2*2";
		String answer = "4";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void multiplyWithMultipleDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "22*10";
		String answer = "220";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void SubtractWithMultipleDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "22-20";
		String answer = "2";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void AddWithMultipleDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "435+56";
		String answer = "491";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void operatorBeforeNumberTest() {
		Calculator cal = new Calculator();
		String expression = "+4+5";
		String answer = "ERROR: Inavlid String Input";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void onlyDigitInputTest() {
		Calculator cal = new Calculator();
		String expression = "5";
		String answer = "5";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}

	@Test
	public void LongInputTest() {
		Calculator cal = new Calculator();
		String expression = "1+2*3+4*5-20+1";
		String answer = "8";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
	
	@Test
	public void NonDigitOrOperatorInputTest() {
		Calculator cal = new Calculator();
		String expression = "abc";
		String answer = "ERROR: Invalid String Input";
		String expectedResult = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answer);
	}
}