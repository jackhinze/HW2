import java.util.Scanner;

public class HW2_3
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int x;
        int y;
        int z = 0;
        int i = 0;
        String Roman = scan.nextLine();
        while(i < (Roman.length())) {
            if (i == (Roman.length() - 1)) {
                switch (Roman.charAt(i)) {
                    default:
                        x = 0;
                        break;
                    case 'M':
                        x = 1000;
                        break;
                    case 'D':
                        x = 500;
                        break;
                    case 'C':
                        x = 100;
                        break;
                    case 'L':
                        x = 50;
                        break;
                    case 'X':
                        x = 10;
                        break;
                    case 'V':
                        x = 5;
                        break;
                    case 'I':
                        x = 1;
                        break;
                }
                result = result + x;
                break;
            }
            if (i < (Roman.length() - 2))
            {
                switch (Roman.charAt(i + 2))
                {
                    default:
                        z = 0;
                        break;
                    case 'M':
                        z = 1000;
                        break;
                    case 'D':
                        z = 500;
                        break;
                    case 'C':
                        z = 100;
                        break;
                    case 'L':
                        z = 50;
                        break;
                    case 'X':
                        z = 10;
                        break;
                    case 'V':
                        z = 5;
                        break;
                    case 'I':
                        z = 1;
                        break;
                }
            }
            switch (Roman.charAt(i)) {
                default:
                    x = 0;
                    break;
                case 'M':
                    x = 1000;
                    break;
                case 'D':
                    x = 500;
                    break;
                case 'C':
                    x = 100;
                    break;
                case 'L':
                    x = 50;
                    break;
                case 'X':
                    x = 10;
                    break;
                case 'V':
                    x = 5;
                    break;
                case 'I':
                    x = 1;
                    break;
            }
            switch (Roman.charAt(i + 1))
            {
                default:
                    y = 0;
                    break;
                case 'M':
                    y = 1000;
                    break;
                case 'D':
                    y = 500;
                    break;
                case 'C':
                    y = 100;
                    break;
                case 'L':
                    y = 50;
                    break;
                case 'X':
                    y = 10;
                    break;
                case 'V':
                    y = 5;
                    break;
                case 'I':
                    y = 1;
                    break;
            }

            if(y <= x)
            {
                result = result + x;
                i = i + 1;
            }
            if(y > x)
            {
                result = result + (y - x);
                i = i + 2;
            }
            if(z > x)
            {
                System.out.println("Error: Not A Roman Numeral");
                System.exit(0);
            }
            z = 0;
        }
        System.out.println(result);
    }
}
