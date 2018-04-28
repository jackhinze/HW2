import java.util.Scanner;

public class romanNumerals {

    public static void main(String[] args) {


        Scanner sysIn = new Scanner(System.in);

        int number;

        String numeral = sysIn.next();

        if (numeral.equals("I")) {

            number = 1;
        }

        else if (numeral.equals("X")) {

            number = 10;
        }

            else if (numeral.equals("C")) {

            number = 100;
        }

            else if (numeral.equals("D")) {

            number = 500;
        }

            else if (numeral.equals("M")) {

            number = 1000;
        }
            else {

            number = 0;
        }

        System.out.println( number );

    }
}
