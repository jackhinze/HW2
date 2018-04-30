import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static String[] corrects = {"I", "V", "X", "L", "C", "D", "M"};
    public static String[] aux = {"V", "L", "D"};

    public static boolean contains(String a, String[] array){
        for (String b : array){
            if(b==a){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(String[] letterNumbers){
        boolean validness;
        for(int i=0; i<letterNumbers.length; i++){
            if (contains(letterNumbers[i], corrects)==false){
                return false;
            }
        }
        return true;
    }

    public static boolean auxSubtract(String[] letterNumbers){
        String current=letterNumbers[0];
        String next=letterNumbers[1];
        for (int k=1; k<letterNumbers.length-1; k++){
            if(contains(current, aux) && Arrays.asList(corrects).indexOf(next)>Arrays.asList(corrects).indexOf(current)){
                return false;
            }
            current=letterNumbers[k];
            next=letterNumbers[k+1];
        }
        return true;
    }

    public static boolean subtractConsec(String[] letterNumbers){
        String current=letterNumbers[0];
        String next=letterNumbers[1];
        String afternext=letterNumbers[2];
        for (int k=1; k<letterNumbers.length-1; k++){
            if(Arrays.asList(corrects).indexOf(afternext)>Arrays.asList(corrects).indexOf(next) &&
                    Arrays.asList(corrects).indexOf(next)>Arrays.asList(corrects).indexOf(current)){
                return false;
            }
            current=letterNumbers[k];
            next=letterNumbers[k+1];
            afternext=letterNumbers[k+2];
        }
        return true;
    }

    public static boolean valuesIncrease(String[] letterNumbers){
        String current=letterNumbers[0];
        String next=letterNumbers[1];
        String afternext=letterNumbers[2];
        for (int k=1; k<letterNumbers.length-1; k++){
            if(Arrays.asList(corrects).indexOf(afternext)>Arrays.asList(corrects).indexOf(next) &&
                    Arrays.asList(corrects).indexOf(afternext)>Arrays.asList(corrects).indexOf(current)){
                return false;
            }
            current=letterNumbers[k];
            next=letterNumbers[k+1];
            afternext=letterNumbers[k+2];
        }
        return true;
    }

    public static int StringToInt(String a){
        switch(a){
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
        }
    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String givenNumber = reader.nextLine();
        String[] givenNumbersArray = givenNumber.split("");
        int L = givenNumber.length();

        //gonna check for error 1, if all letters are valid:
        if (isValid(givenNumbersArray)==false){
            System.out.println("Error: Not all characters are valid Roman Numerals.");
        }
        else if (auxSubtract(givenNumbersArray)==false){
            System.out.println("Error: Auxiliary symbols are not allowed to be subtracted in Roman Numerals.");
        }
        else if (subtractConsec(givenNumbersArray)==false){
            System.out.println("Error: Subtraction of consecutive characters is not allowed.");
        }
        else if (valuesIncrease(givenNumbersArray)==false){
            System.out.println("Error: The value of symbols to be added must not increase as we work through the Roman Numeral.");
        }
        else{
            if(L==1){
                System.out.println(StringToInt(givenNumbersArray[0]));
            }
            else{
                int calculations = StringToInt(givenNumbersArray[0]);
                for(int i=0; i<L-1; i++){
                    int current=StringToInt(givenNumbersArray[i]);
                    int next =StringToInt(givenNumbersArray[i+1]);
                    if(current>=next){
                        calculations = calculations+next;
                    }
                    else{
                        calculations = calculations+next-current;
                    }
                }
                System.out.println(calculations);
            }
        }
    }
}
