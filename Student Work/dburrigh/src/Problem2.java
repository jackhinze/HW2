import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String PN = scan.nextLine();
        int PhoneNumber = PN.length();
        int[] numbers = new int[PhoneNumber];

        int x = 0;
        while(x<PhoneNumber)
        {
            numbers[x] = Character.getNumericValue(PN.charAt(x));
            x++;
        }//make an array list

        String[] association = {" "+" "+" "," "+" "+" ", "abc","def", "ghi", "jkl", "mno","prs","tuv","wxy"};
            for (int i = 0; i < 3; i++) {
                int z = 0;
                while (z < PhoneNumber) {
                    for (int j = 0; j < PhoneNumber; j++) {
                        if (j == PhoneNumber-1) {
                            System.out.println(association[numbers[j]].charAt(i));
                        }
                        else
                        {
                            System.out.print(association[numbers[j]].charAt(i));
                        }
                    }
                    z++;
                }
            }
    }
}
