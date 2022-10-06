package java;
import static org.junit.Assert.assertEquals;
import java.Calculator;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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