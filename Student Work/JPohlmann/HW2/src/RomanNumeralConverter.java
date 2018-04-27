import java.util.HashMap;
import java.util.Scanner;

public class RomanNumeralConverter {
    public static void main(java.lang.String args[]) {
        System.out.println("Insert Roman Numeral");
        Scanner sysIn = new Scanner(System.in);
        String romanNumber = sysIn.next();
        if (romanToInteger(romanNumber) == 0.1) {
            System.out.println("Error: Not all characters are valid Roman Numerals.");
        }
        else if(romanToInteger(romanNumber)==0.2){
            System.out.println( "Error: Auxiliary symbols are not allowed to be subtracted in Roman Numerals.");
        }
        else if(romanToInteger(romanNumber)==0.3){
            System.out.println("Error: Subtraction of consecutive characters is not allowed.");
        }
        else if(romanToInteger(romanNumber)==0.4){
            System.out.println("Error: The value of symbols to be added must not increase as we work through the Roman Numeral.");
        }
        else{
            System.out.println(romanToInteger(romanNumber));
        }
    }
    public static double romanToInteger(String romanNumber) {
        double decimal = 0;
        double lastNumber = 0;
        String romanNumeral = romanNumber.toUpperCase();
        char[] numeralList= new char[romanNumeral.length()];

        for (int x = romanNumeral.length() - 1; x >= 0 ; x--) {
            numeralList[x]= romanNumeral.charAt(x);
            char convertToDecimal = romanNumeral.charAt(x);

            if(convertToDecimal == 'M'||convertToDecimal=='D'||convertToDecimal=='C'||convertToDecimal=='L'||convertToDecimal=='X'||convertToDecimal=='V'||convertToDecimal=='I') {

                switch (convertToDecimal) {
                    case 'M':
                        decimal = numeralMath(1000, lastNumber, decimal);
                        lastNumber = 1000;
                        break;

                    case 'D':
                        decimal = numeralMath(500, lastNumber, decimal);
                        lastNumber = 500;
                        break;

                    case 'C':
                        decimal = numeralMath(100, lastNumber, decimal);
                        lastNumber = 100;
                        break;

                    case 'L':
                        decimal = numeralMath(50, lastNumber, decimal);
                        lastNumber = 50;
                        break;

                    case 'X':
                        decimal = numeralMath(10, lastNumber, decimal);
                        lastNumber = 10;
                        break;

                    case 'V':
                        decimal = numeralMath(5, lastNumber, decimal);
                        lastNumber = 5;
                        break;

                    case 'I':
                        decimal = numeralMath(1, lastNumber, decimal);
                        lastNumber = 1;
                        break;
                }
            }
            else{
                return 0.1;
                }
            if(decimal==0.2) {
                return 0.2;
            }

            }
         if(checkSubtract(numeralList)==true){

         }
         else{
            return 0.3;
         }
         for(int x =0; x < (numeralList.length-2);x++){
            if(numeralList.length>2) {


                if (checkPosition.get(numeralList[x]) < (checkPosition.get(numeralList[x + 2]) - checkPosition.get(numeralList[x + 1]))) {
                    return 0.4;
                }
            }


         }
            return decimal;
        }

    public static boolean checkSubtract(char[] numeralList){
        for(int x=0;x< numeralList.length;x++){
            if(numeralList[x]=='I'&&numeralList[x+1]=='V'&&numeralList[x+2]=='X'){
               return false;
            }
            else if(numeralList[x]=='V'&&numeralList[x+1]=='X'&&numeralList[x+2]=='L'){
                return false;
            }
            else if(numeralList[x]=='X'&&numeralList[x+1]=='L'&&numeralList[x+2]=='C'){
                return false;
            }
            else if(numeralList[x]=='L'&&numeralList[x+1]=='C'&&numeralList[x+2]=='D'){
                return false;
            }
            else if(numeralList[x]=='C'&&numeralList[x+1]=='D'&&numeralList[x+2]=='M'){
                return false;
            }
            else{
                return true;
            }
        }
        return true;

}
    static final HashMap<Character, Integer> checkPosition = new HashMap<Character, Integer>() {
        {
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
            put(' ',0);

        }
    };

    public static double numeralMath(double decimal, double lastNumber, double lastDecimal) {
        if (lastNumber > decimal&& (decimal==5||decimal==50||decimal==500)) {
            return 0.2;
        }
        else if(lastNumber > decimal){
            return lastDecimal - decimal;
        }
        else {
            return lastDecimal + decimal;
        }
    }


}
