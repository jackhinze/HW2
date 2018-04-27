import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static javax.swing.UIManager.put;

public class Problem2Texting {


        public static void main(String[] args) {
            System.out.println("What is the number?");
            Scanner sysIn= new Scanner(System.in);
            String input=sysIn.next();
            System.out.println(letterCombinations(input));
        }

        public static ArrayList<String> letterCombinations(String digits) {
            ArrayList<String> result = new ArrayList<String>();
            ArrayList<String> preresult = new ArrayList<String>();
            result.add("");

            for (int i = 0; i < digits.length(); i++) {
                for (String str : result) {
                    String letters = map.get(digits.charAt(i));
                    for (int j = 0; j < letters.length(); j++)
                        preresult.add(str + letters.charAt(j));
                }
                result = preresult;
                preresult = new ArrayList<String>();
            }
            return result;
        }

        static final HashMap<Character, String> map = new HashMap<Character, String>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "prs");
                put('8', "tuv");
                put('9', "wxy");
                put('1'," ");
                put('0'," ");
            }
        };
}
