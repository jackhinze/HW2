import java.util.Scanner;

public class HW2_1
{

    public static void main(String[] args)
    {
            Scanner sysIn = new Scanner(System.in);

            String entered=sysIn.nextLine();

            String[] arr = entered.split(" ");

        HW2_1.entered(arr);
    }

    private static int MostCharacters(String[] entered)
    {
        int MostCharacters = 1;

        for (int n = 0; n < entered.length; n++)
        {

            if (entered[n].length() >= MostCharacters)
            {
                MostCharacters = entered[n].length();
            }

        }
        return MostCharacters;
    }

    private static void entered(String[] number)
    {

        System.out.print("+");

        int e = HW2_1.MostCharacters(number);

        for (int n = 1; n < e + 3; n++)
        {

            System.out.print("-");
        }
        for (int n = 0; n < number.length; n++)
        {

            System.out.print("| " + number[n]);

            for (int b = 0; b <= e - number[n].length(); b++)
            {

                System.out.print(" ");
            }
            System.out.println("|");
        }

            System.out.println("+");


                    System.out.print("+");

            for (int n = 1; n < e + 3; n++)
            {

                System.out.print("-");
            }
                System.out.print("+");
    }


}



