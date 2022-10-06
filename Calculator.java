/**
 * Calculator
 */
import java.util.*;
public class Calculator {

    private Scanner input;

    public Calculator()
    {
        input = new Scanner(System.in);
    }

    public int calculate(String s)
    {
        if(!checkString(s))
        {
            System.out.println("ERROR: Inavlid String Input");
            return -1;
        }

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<String> ops = new ArrayList<String>();
        splitString(ints,ops,s);


        return -1;
    }

    private void splitString(ArrayList<Integer> ints, ArrayList<String> ops, String s)
    {

    }

    public static boolean checkString(String s)
    {
        char start = s.charAt(0);
        int length = s.length();
        char end = s.charAt(length-1);

        if(!Character.isDigit(start) || !Character.isDigit(end))
        {
            return false;
        }

        boolean lastWasOp = false;
        for(int i = 0; i < length; i++)
        {
            char c = s.charAt(i);
            if(!Character.isDigit(c) && c != '*' && c != '+' && c!= '-')
            {
                return false;
            }

            if(c == '*' || c == '+' || c == '-')
            {
                if(lastWasOp == false)
                    lastWasOp = true;
                else
                    return false;
            }
            else
            {
                lastWasOp = false;
            }
            
        }
        return true;
    }
}
