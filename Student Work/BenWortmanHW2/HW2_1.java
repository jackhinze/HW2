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
}



