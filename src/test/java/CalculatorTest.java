package src.test.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import src.main.java.Calculator;

@SuppressWarnings("unused")
@RunWith(JUnit4.class)
public class CalculatorTest
{
	@Test
	public void testConstructor()
	{
		new Calculator();
	}

}