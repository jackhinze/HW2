import java.util.Scanner;

public class HW2texting {

    public static void main(String[] args) {

        Scanner sysIn = new Scanner(System.in);

        int[] num = new int[7];

        String current;

        String[] letter = new String[3];

        for (int i = 0; i < 7; i++) {
            num[i] = sysIn.nextInt();

            switch (num[i]) {

                case 1:
                    num[i] = 2;

                    letter[0] = "a";
                    letter[1] = "b";
                    letter[2] = "c";

                    current = letter[0];

                case 2:
                    num[i] = 3;

                    letter[0] = "d";
                    letter[1] = "e";
                    letter[2] = "f";
                    System.out.println(letter[0]);

                case 3:
                    num[i] = 4;

                    letter[0] = "g";
                    letter[1] = "h";
                    letter[2] = "i";
                    System.out.println(letter[0]);

            }

        }

    }
}
