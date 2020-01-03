package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        Set<String> subStrings = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0 ; i < string.length() ; i ++){
            for (int j = i+1 ; j <= string.length(); j++){
                subStrings.add(string.substring(i,j));
            }
        }
       String [] temp =  subStrings.toArray(new String[0]);
        for (String s : temp){
            if (isPalindrome(s) == true){
                result.add(s);
            }

        }      return result.toArray(new String[0]);

    }

    public static Boolean isPalindrome(String string) {

        if (reverseString(string).equals(string)){
            return true;
        }
        else{
        return false;
        }
    }

    public static String reverseString(String string) {
       char[] chars =  string.toCharArray();
       String result = "";
       for (int i =  string.length()-1 ;  i >=0  ; i --){
           result += chars[i];

       }
        return result;
    }
}
