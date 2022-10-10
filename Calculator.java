/**
 * Calculator
 */
import java.util.*;
public class Calculator {

    public Calculator()
    {
        System.out.println("Welcome to the Calculator");
    }

    public String calculate(String s)
    {
        if(!checkString(s))
        {
            return "ERROR: Inavlid String Input";
            
            
        }

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<String> ops = new ArrayList<String>();
        splitString(ints,ops,s);
        if(ints.size() != (ops.size() + 1))
        {
            System.out.println("ERROR: Inavlid Num of ints v Ops");
            
        }

        while(ops.indexOf("*") != -1)
        {
            int mulIndex = ops.indexOf("*");
            int result = ints.get(mudlIndex) * ints.get(mulIndex + 1);

            ops.remove(mulIndex);
            ints.remove(mulIndex);
            ints.remove(mulIndex);
            ints.add(mulIndex, result);
        }

        int result = ints.get(0);
        for(int i = 0; i < ops.size(); i++)
        {
            char operator = ops.get(i).charAt(0);

            if(operator == '+')
                result = result + ints.get(i + 1);
            else if(operator == '-')
                result = result - ints.get(i + 1);
            else
                System.out.println("ERROR: Not an operator");
                
        }
        
        return Integer.toString(result);
    }

    private static void splitString(ArrayList<Integer> ints, ArrayList<String> ops, String s)
    {
    	for(int i = 0;i < s.length();i++) {
    		char c = s.charAt(i);
    		if(Character.isDigit(c)) {
    			int count = 0;
    			for(int k = i+1;k < s.length();k++) {
    				char c2 = s.charAt(k);
    				if(Character.isDigit(c2)) {
    					count++;
    				}
                    if(!Character.isDigit(c2)){
                        break;
                    }
                }
                String s2 = "";
    				while(count >= 0) {
    					char c3 = s.charAt(i++);
                        s2 = s2 + c3;
    					//ints.add(Character.getNumericValue(c3));
    					count--;
    				}
                    ints.add(Integer.parseInt(s2));
                    if(count == -1){
                        i--;
                    }
    		}
        else ops.add(Character.toString(c));
    }
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
