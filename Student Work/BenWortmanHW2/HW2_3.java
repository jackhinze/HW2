
import java.util.Scanner;


public class HW2_3
{

    private static int num(char letter)
    {
        if (letter == 'I')
        {
            return 1;
        }

        if (letter =='V')
        {
            return 5;
        }

        if (letter == 'X')
        {
            return 10;
        }
        if (letter == 'L')
        {
            return 50;
        }
        if (letter == 'C')
        {
            return 100;
        }
        if (letter == 'D')
        {
            return 500;
        }
        if (letter == 'M')
        {
            return 1000;
        }

    }
}
