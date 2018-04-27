import java.util.Scanner;

public class HW2_2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String j = scan.nextLine();
        j.replaceAll("\\s","");
        int z = Character.getNumericValue(j.charAt(0));
        int y = Character.getNumericValue(j.charAt(1));
        int x = Character.getNumericValue(j.charAt(2));
        int w = Character.getNumericValue(j.charAt(3));
        int v = Character.getNumericValue(j.charAt(4));
        int u = Character.getNumericValue(j.charAt(5));
        int t = Character.getNumericValue(j.charAt(6));

        for(int a = 0; a < 3; a++)
        {
            String Phone = "";
            if(z == 2 && a == 0)
            {
                Phone = Phone + "a";
            }
            if(z == 2 && a == 1)
            {
                Phone = Phone + "b";
            }
            if(z == 2 && a == 2)
            {
                Phone = Phone + "c";
            }
            if(z == 3 && a == 0)
            {
                Phone = Phone + "d";
            }
            if(z == 3 && a == 1)
            {
                Phone = Phone + "e";
            }
            if(z == 3 && a == 2)
            {
                Phone = Phone + "f";
            }
            if(z == 4 && a == 0)
            {
                Phone = Phone + "g";
            }
            if(z == 4 && a == 1)
            {
                Phone = Phone + "h";
            }
            if(z == 4 && a == 2)
            {
                Phone = Phone + "i";
            }
            if(z == 5 && a == 0)
            {
                Phone = Phone + "j";
            }
            if(z == 5 && a == 1)
            {
                Phone = Phone + "k";
            }
            if(z == 5 && a == 2)
            {
                Phone = Phone + "l";
            }
            if(z == 6 && a == 0)
            {
                Phone = Phone + "m";
            }
            if(z == 6 && a == 1)
            {
                Phone = Phone + "n";
            }
            if(z == 6 && a == 2)
            {
                Phone = Phone + "o";
            }
            if(z == 7 && a == 0)
            {
                Phone = Phone + "p";
            }
            if(z == 7 && a == 1)
            {
                Phone = Phone + "r";
            }
            if(z == 7 && a == 2)
            {
                Phone = Phone + "s";
            }
            if(z == 8 && a == 0)
            {
                Phone = Phone + "t";
            }
            if(z == 8 && a == 1)
            {
                Phone = Phone + "u";
            }
            if(z == 8 && a == 2)
            {
                Phone = Phone + "v";
            }
            if(z == 9 && a == 0)
            {
                Phone = Phone + "w";
            }
            if(z == 9 && a == 1)
            {
                Phone = Phone + "x";
            }
            if(z == 9 && a == 2)
            {
                Phone = Phone + "y";
            }
            if(z == 1 || z == 0)
            {
                Phone = Phone + " ";
            }
            for(int b = 0; b < 3; b++)
            {
                String Phone1 = Phone;
                if(y == 2 && b == 0)
                {
                    Phone1 = Phone1 + "a";
                }
                if(y == 2 && b == 1)
                {
                    Phone1 = Phone1 + "b";
                }
                if(y == 2 && b == 2)
                {
                    Phone1 = Phone1 + "c";
                }
                if(y == 3 && b == 0)
                {
                    Phone1 = Phone1 + "d";
                }
                if(y == 3 && b == 1)
                {
                    Phone1 = Phone1 + "e";
                }
                if(y == 3 && b == 2)
                {
                    Phone1 = Phone1 + "f";
                }
                if(y == 4 && b == 0)
                {
                    Phone1 = Phone1 + "g";
                }
                if(y == 4 && b == 1)
                {
                    Phone1 = Phone1 + "h";
                }
                if(y == 4 && b == 2)
                {
                    Phone1 = Phone1 + "i";
                }
                if(y == 5 && b == 0)
                {
                    Phone1 = Phone1 + "j";
                }
                if(y == 5 && b == 1)
                {
                    Phone1 = Phone1 + "k";
                }
                if(y == 5 && b == 2)
                {
                    Phone1 = Phone1 + "l";
                }
                if(y == 6 && b == 0)
                {
                    Phone1 = Phone1 + "m";
                }
                if(y == 6 && b == 1)
                {
                    Phone1 = Phone1 + "n";
                }
                if(y == 6 && b == 2)
                {
                    Phone1 = Phone1 + "o";
                }
                if(y == 7 && b == 0)
                {
                    Phone1 = Phone1 + "p";
                }
                if(y == 7 && b == 1)
                {
                    Phone1 = Phone1 + "r";
                }
                if(y == 7 && b == 2)
                {
                    Phone1 = Phone1 + "s";
                }
                if(y == 8 && b == 0)
                {
                    Phone1 = Phone1 + "t";
                }
                if(y == 8 && b == 1)
                {
                    Phone1 = Phone1 + "u";
                }
                if(y == 8 && b == 2)
                {
                    Phone1 = Phone1 + "v";
                }
                if(y == 9 && b == 0)
                {
                    Phone1 = Phone1 + "w";
                }
                if(y == 9 && b == 1)
                {
                    Phone1 = Phone1 + "x";
                }
                if(y == 9 && b == 2)
                {
                    Phone1 = Phone1 + "y";
                }
                if(y == 1 || y == 0)
                {
                    Phone1 = Phone1 + " ";
                }
                for(int c = 0; c < 3; c++)
                {
                    String Phone2 = Phone1;
                    if(x == 2 && c == 0)
                    {
                        Phone2 = Phone2 + "a";
                    }
                    if(x == 2 && c == 1)
                    {
                        Phone2 = Phone2 + "b";
                    }
                    if(x == 2 && c == 2)
                    {
                        Phone2 = Phone2 + "c";
                    }
                    if(x == 3 && c == 0)
                    {
                        Phone2 = Phone2 + "d";
                    }
                    if(x == 3 && c == 1)
                    {
                        Phone2 = Phone2 + "e";
                    }
                    if(x == 3 && c == 2)
                    {
                        Phone2 = Phone2 + "f";
                    }
                    if(x == 4 && c == 0)
                    {
                        Phone2 = Phone2 + "g";
                    }
                    if(x == 4 && c == 1)
                    {
                        Phone2 = Phone2 + "h";
                    }
                    if(x == 4 && c == 2)
                    {
                        Phone2 = Phone2 + "i";
                    }
                    if(x == 5 && c == 0)
                    {
                        Phone2 = Phone2 + "j";
                    }
                    if(x == 5 && c == 1)
                    {
                        Phone2 = Phone2 + "k";
                    }
                    if(x == 5 && c == 2)
                    {
                        Phone2 = Phone2 + "l";
                    }
                    if(x == 6 && c == 0)
                    {
                        Phone2 = Phone2 + "m";
                    }
                    if(x == 6 && c == 1)
                    {
                        Phone2 = Phone2 + "n";
                    }
                    if(x == 6 && c == 2)
                    {
                        Phone2 = Phone2 + "o";
                    }
                    if(x == 7 && c == 0)
                    {
                        Phone2 = Phone2 + "p";
                    }
                    if(x == 7 && c == 1)
                    {
                        Phone2 = Phone2 + "r";
                    }
                    if(x == 7 && c == 2)
                    {
                        Phone2 = Phone2 + "s";
                    }
                    if(x == 8 && c == 0)
                    {
                        Phone2 = Phone2 + "t";
                    }
                    if(x == 8 && c == 1)
                    {
                        Phone2 = Phone2 + "u";
                    }
                    if(x == 8 && c == 2)
                    {
                        Phone2 = Phone2 + "v";
                    }
                    if(x == 9 && c == 0)
                    {
                        Phone2 = Phone2 + "w";
                    }
                    if(x == 9 && c == 1)
                    {
                        Phone2 = Phone2 + "x";
                    }
                    if(x == 9 && c == 2)
                    {
                        Phone2 = Phone2 + "y";
                    }
                    if(x == 1 || x == 0)
                    {
                        Phone2 = Phone2+ " ";
                    }
                    for(int d = 0; d < 3; d++)
                    {
                        String Phone3 = Phone2;
                        if(w == 2 && d == 0)
                        {
                            Phone3 = Phone3 + "a";
                        }
                        if(w == 2 && d == 1)
                        {
                            Phone3 = Phone3 + "b";
                        }
                        if(w == 2 && d == 2)
                        {
                            Phone3 = Phone3 + "c";
                        }
                        if(w == 3 && d == 0)
                        {
                            Phone3 = Phone3 + "d";
                        }
                        if(w == 3 && d == 1)
                        {
                            Phone3 = Phone3 + "e";
                        }
                        if(w == 3 && d == 2)
                        {
                            Phone3 = Phone3 + "f";
                        }
                        if(w == 4 && d == 0)
                        {
                            Phone3 = Phone3 + "g";
                        }
                        if(w == 4 && d == 1)
                        {
                            Phone3 = Phone3 + "h";
                        }
                        if(w == 4 && d == 2)
                        {
                            Phone3 = Phone3 + "i";
                        }
                        if(w == 5 && d == 0)
                        {
                            Phone3 = Phone3 + "j";
                        }
                        if(w == 5 && d == 1)
                        {
                            Phone3 = Phone3 + "k";
                        }
                        if(w == 5 && d == 2)
                        {
                            Phone3 = Phone3 + "l";
                        }
                        if(w == 6 && d == 0)
                        {
                            Phone3 = Phone3 + "m";
                        }
                        if(w == 6 && d == 1)
                        {
                            Phone3 = Phone3 + "n";
                        }
                        if(w == 6 && d == 2)
                        {
                            Phone3 = Phone3 + "o";
                        }
                        if(w == 7 && d == 0)
                        {
                            Phone3 = Phone3 + "p";
                        }
                        if(w == 7 && d == 1)
                        {
                            Phone3 = Phone3 + "r";
                        }
                        if(w == 7 && d == 2)
                        {
                            Phone3 = Phone3 + "s";
                        }
                        if(w == 8 && d == 0)
                        {
                            Phone3 = Phone3 + "t";
                        }
                        if(w == 8 && d == 1)
                        {
                            Phone3 = Phone3 + "u";
                        }
                        if(w == 8 && d == 2)
                        {
                            Phone3 = Phone3 + "v";
                        }
                        if(w == 9 && d == 0)
                        {
                            Phone3 = Phone3 + "w";
                        }
                        if(w == 9 && d == 1)
                        {
                            Phone3 = Phone3 + "x";
                        }
                        if(w == 9 && d == 2)
                        {
                            Phone3 = Phone3 + "y";
                        }
                        if(w == 1 || w == 0)
                        {
                            Phone3 = Phone3 + " ";
                        }
                        for(int e = 0; e < 3; e++)
                        {
                            String Phone4 = Phone3;
                            if(v == 2 && e == 0)
                            {
                                Phone4 = Phone4 + "a";
                            }
                            if(v == 2 && e == 1)
                            {
                                Phone4 = Phone4 + "b";
                            }
                            if(v == 2 && e == 2)
                            {
                                Phone4 = Phone4 + "c";
                            }
                            if(v == 3 && e == 0)
                            {
                                Phone4 = Phone4 + "d";
                            }
                            if(v == 3 && e == 1)
                            {
                                Phone4 = Phone4 + "e";
                            }
                            if(v == 3 && e == 2)
                            {
                                Phone4 = Phone4 + "f";
                            }
                            if(v == 4 && e == 0)
                            {
                                Phone4 = Phone4 + "g";
                            }
                            if(v == 4 && e == 1)
                            {
                                Phone4 = Phone4 + "h";
                            }
                            if(v == 4 && e == 2)
                            {
                                Phone4 = Phone4 + "i";
                            }
                            if(v == 5 && e == 0)
                            {
                                Phone4 = Phone4 + "j";
                            }
                            if(v == 5 && e == 1)
                            {
                                Phone4 = Phone4 + "k";
                            }
                            if(v == 5 && e == 2)
                            {
                                Phone4 = Phone4 + "l";
                            }
                            if(v == 6 && e == 0)
                            {
                                Phone4 = Phone4 + "m";
                            }
                            if(v == 6 && e == 1)
                            {
                                Phone4 = Phone4 + "n";
                            }
                            if(v == 6 && e == 2)
                            {
                                Phone4 = Phone4 + "o";
                            }
                            if(v == 7 && e == 0)
                            {
                                Phone4 = Phone4 + "p";
                            }
                            if(v == 7 && e == 1)
                            {
                                Phone4 = Phone4 + "r";
                            }
                            if(v == 7 && e == 2)
                            {
                                Phone4 = Phone4 + "s";
                            }
                            if(v == 8 && e == 0)
                            {
                                Phone4 = Phone4 + "t";
                            }
                            if(v == 8 && e == 1)
                            {
                                Phone4 = Phone4 + "u";
                            }
                            if(v == 8 && e == 2)
                            {
                                Phone4 = Phone4 + "v";
                            }
                            if(v == 9 && e == 0)
                            {
                                Phone4 = Phone4 + "w";
                            }
                            if(v == 9 && e == 1)
                            {
                                Phone4 = Phone4 + "x";
                            }
                            if(v == 9 && e == 2)
                            {
                                Phone4 = Phone4 + "y";
                            }
                            if(v == 1 || v == 0)
                            {
                                Phone4 = Phone4 + " ";
                            }
                            for(int f = 0; f < 3; f++)
                            {
                                String Phone5 = Phone4;
                                if(u == 2 && f == 0)
                                {
                                    Phone5 = Phone5 + "a";
                                }
                                if(u == 2 && f == 1)
                                {
                                    Phone5 = Phone5 + "b";
                                }
                                if(u == 2 && f == 2)
                                {
                                    Phone5 = Phone5 + "c";
                                }
                                if(u == 3 && f == 0)
                                {
                                    Phone5 = Phone5 + "d";
                                }
                                if(u == 3 && f == 1)
                                {
                                    Phone5 = Phone5 + "e";
                                }
                                if(u == 3 && f == 2)
                                {
                                    Phone5 = Phone5 + "f";
                                }
                                if(u == 4 && f == 0)
                                {
                                    Phone5 = Phone5 + "g";
                                }
                                if(u == 4 && f == 1)
                                {
                                    Phone5 = Phone5 + "h";
                                }
                                if(u == 4 && f == 2)
                                {
                                    Phone5 = Phone5 + "i";
                                }
                                if(u == 5 && f == 0)
                                {
                                    Phone5 = Phone5 + "j";
                                }
                                if(u == 5 && f == 1)
                                {
                                    Phone5 = Phone5 + "k";
                                }
                                if(u == 5 && f == 2)
                                {
                                    Phone5 = Phone5 + "l";
                                }
                                if(u == 6 && f == 0)
                                {
                                    Phone5 = Phone5 + "m";
                                }
                                if(u == 6 && f == 1)
                                {
                                    Phone5 = Phone5 + "n";
                                }
                                if(u == 6 && f == 2)
                                {
                                    Phone5 = Phone5 + "o";
                                }
                                if(u == 7 && f == 0)
                                {
                                    Phone5 = Phone5 + "p";
                                }
                                if(u == 7 && f == 1)
                                {
                                    Phone5 = Phone5 + "r";
                                }
                                if(u == 7 && f == 2)
                                {
                                    Phone5 = Phone5 + "s";
                                }
                                if(u == 8 && f == 0)
                                {
                                    Phone5 = Phone5 + "t";
                                }
                                if(u == 8 && f == 1)
                                {
                                    Phone5 = Phone5 + "u";
                                }
                                if(u == 8 && f == 2)
                                {
                                    Phone5 = Phone5 + "v";
                                }
                                if(u == 9 && f == 0)
                                {
                                    Phone5 = Phone5 + "w";
                                }
                                if(u == 9 && f == 1)
                                {
                                    Phone5 = Phone5 + "x";
                                }
                                if(u == 9 && f == 2)
                                {
                                    Phone5 = Phone5 + "y";
                                }
                                if(u == 1 || u == 0)
                                {
                                    Phone5 = Phone5 + " ";
                                }
                                for(int g = 0; g < 3; g++)
                                {
                                    String Phone6 = Phone5;
                                    if(t == 2 && g == 0)
                                    {
                                        Phone6 = Phone6 + "a";
                                    }
                                    if(t == 2 && g == 1)
                                    {
                                        Phone6 = Phone6 + "b";
                                    }
                                    if(t == 2 && g == 2)
                                    {
                                        Phone6 = Phone6 + "c";
                                    }
                                    if(t == 3 && g == 0)
                                    {
                                        Phone6 = Phone6 + "d";
                                    }
                                    if(t == 3 && g == 1)
                                    {
                                        Phone6 = Phone6 + "e";
                                    }
                                    if(t == 3 && g == 2)
                                    {
                                        Phone6 = Phone6 + "f";
                                    }
                                    if(t == 4 && g == 0)
                                    {
                                        Phone6 = Phone6 + "g";
                                    }
                                    if(t == 4 && g == 1)
                                    {
                                        Phone6 = Phone6 + "h";
                                    }
                                    if(t == 4 && g == 2)
                                    {
                                        Phone6 = Phone6 + "i";
                                    }
                                    if(t == 5 && g == 0)
                                    {
                                        Phone6 = Phone6 + "j";
                                    }
                                    if(t == 5 && g == 1)
                                    {
                                        Phone6 = Phone6 + "k";
                                    }
                                    if(t == 5 && g == 2)
                                    {
                                        Phone6 = Phone6 + "l";
                                    }
                                    if(t == 6 && g == 0)
                                    {
                                        Phone6 = Phone6 + "m";
                                    }
                                    if(t == 6 && g == 1)
                                    {
                                        Phone6 = Phone6 + "n";
                                    }
                                    if(t == 6 && g == 2)
                                    {
                                        Phone6 = Phone6 + "o";
                                    }
                                    if(t == 7 && g == 0)
                                    {
                                        Phone6 = Phone6 + "p";
                                    }
                                    if(t == 7 && g == 1)
                                    {
                                        Phone6 = Phone6 + "r";
                                    }
                                    if(t == 7 && g == 2)
                                    {
                                        Phone6 = Phone6 + "s";
                                    }
                                    if(t == 8 && g == 0)
                                    {
                                        Phone6 = Phone6 + "t";
                                    }
                                    if(t == 8 && g == 1)
                                    {
                                        Phone6 = Phone6 + "u";
                                    }
                                    if(t == 8 && g == 2)
                                    {
                                        Phone6 = Phone6 + "v";
                                    }
                                    if(t == 9 && g == 0)
                                    {
                                        Phone6 = Phone6 + "w";
                                    }
                                    if(t == 9 && g == 1)
                                    {
                                        Phone6 = Phone6 + "x";
                                    }
                                    if(t == 9 && g == 2)
                                    {
                                        Phone6 = Phone6 + "y";
                                    }
                                    if(t == 1 || t == 0)
                                    {
                                        Phone6 = Phone6 + " ";
                                    }
                                    System.out.println(Phone6);
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
