/**
 * Calculator
 */
import java.util.*;
public class Calculator {

    private Scanner input;

    public Calculator()
    {
        input = new Scanner(System.in);
        if(checkString(expression)) {
        	System.out.print("Yes");
        }
        else {
        	System.out.print("No");
        }
    }

    public static boolean checkString(String s){
        char start = s.charAt(0);
        int length = s.length();
        char end = s.charAt(length-1);
        if(!Character.isDigit(start) || !Character.isDigit(end)){
            return false;
        }
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(i) || c != '*' || c != '+' || c!= '-')
                {
                    return false;
                }
            
        }
        return true;
    }
}
