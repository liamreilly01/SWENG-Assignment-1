package src.test.java;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import src.main.java.Calculator;

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
		String expectedResult = "3";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void subtractWithOneDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "2-1";
		String expectedResult = "1";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void multiplyWithOneDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "2*2";
		String expectedResult = "4";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void multiplyWithMultipleDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "22*10";
		String expectedResult = "220";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void SubtractWithMultipleDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "22-20";
		String expectedResult = "2";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void AddWithMultipleDigitWidthTest() {
		Calculator cal = new Calculator();
		String expression = "435+56";
		String expectedResult = "491";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void operatorBeforeNumberTest() {
		Calculator cal = new Calculator();
		String expression = "+4+5";
		String expectedResult = "ERROR: Inavlid String Input";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void onlyDigitInputTest() {
		Calculator cal = new Calculator();
		String expression = "5";
		String expectedResult = "5";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}

	@Test
	public void LongInputTest() {
		Calculator cal = new Calculator();
		String expression = "1+2*3+4*5-20+1";
		String expectedResult = "8";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
	
	@Test
	public void NonDigitOrOperatorInputTest() {
		Calculator cal = new Calculator();
		String expression = "abc";
		String expectedResult = "ERROR: Invalid String Input";
		String answerReceived = cal.calculate(expression);
		Assert.assertEquals(expectedResult, answerReceived);
	}
}