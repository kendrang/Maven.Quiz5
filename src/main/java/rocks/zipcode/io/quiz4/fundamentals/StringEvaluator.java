package rocks.zipcode.io.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {

        Set<String> subStrings = new HashSet<>();
        for (int i = 0 ; i < string.length() ; i ++){
            for (int j = i+1 ; j <= string.length(); j++){
                subStrings.add(string.substring(i,j));
            }
        } return subStrings.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        ArrayList<String> result = new ArrayList<>();
        String[] s1 =  getAllSubstrings(string1);
        String[] s2 = getAllSubstrings(string2);
        for (String s : s1){
            if(string2.contains(s)){
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

       String[] compare =  getCommonSubstrings(string1, string2);
       Integer biggest = 1;
       String largestCommon = "";
       for (String s : compare){
         if (s.length() > biggest){
             biggest = s.length();
             largestCommon = s;
         }
       }

        return largestCommon;
    }
}
