import java.util.Scanner;

public class Problem3 {

    private static int value(char rn)//rn = roman numeral
    {
        if (rn == 'I') {
            return 1;
        }
        if (rn == 'V') {
            return 5;
        }
        if (rn == 'X') {
            return 10;
        }
        if (rn == 'L') {
            return 50;
        }
        if (rn == 'C') {
            return 100;
        }
        if (rn == 'D') {
            return 500;
        }
        if (rn == 'M') {
            return 1000;
        }
        return -1;
    }

    private static int Convert(String Letters) {
        int result = 0;
        int[] Roman = new int[Letters.length()];
        for (int a = 0; a < Letters.length(); a++) {

            if (value(Letters.charAt(a)) < 0) {
                System.out.println("Error: Not all characters are valid Roman Numerals");
                break;
            }
            Roman[a] = value(Letters.charAt(a));//Roman[a] = letter 1
        }
        int subcount = 0; //subtraction counter
        int SmallestAdd = 1000;
        for (int a = 0; a < Roman.length; a++) {
            if(a == Roman.length - 1)
            {
                if (Roman[a] > SmallestAdd) {
                    System.out.println("Error: The value of symbols to be added must not increase as we work through the Roman Numeral");
                    break;
                }
                    result = result + Roman[a];
                    return result;
            }
            if (Roman[a] >= Roman[a + 1]) {
                if (Roman[a] > SmallestAdd) {
                    System.out.println("Error: The value of symbols to be added must not increase as we work through the Roman Numeral");
                    break;
                } else {
                    result = result + Roman[a];
                    subcount = 0;
                    SmallestAdd = Roman[a];
                }
            } else {
                if (Roman[a] == 5 || Roman[a] == 50 || Roman[a] == 500) {
                    System.out.println("Error: Auxiliary symbols are not allowed to be subtracted in Roman Numerals");
                    break;
                }
                subcount++;
                if (subcount >= 2) {
                    System.out.println("Error: Subtraction of consecutive characters is not allowed");
                    break;
                }
                result = result - Roman[a];
            }

        }
        result = result + Roman[Roman.length - 1];

     //this is the "algorithm" that will add/subtract the letters to Convert the Roman Numeral to an integer
        return result;
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Roman Numeral");
        String RomanNumeral = scan.nextLine();
        System.out.println("The Roman Numeral you entered is " + Problem3.Convert(RomanNumeral));
    }
}
