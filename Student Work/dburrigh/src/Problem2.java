import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] PhoneNumber = new int[7];

        int x = 0;
        while(x<7)
        {
            PhoneNumber[x] = scan.nextInt();
            x++;
        }

        String[] association = {" "," ", "abc","def", "ghi", "jkl", "mno","prs","tuv","wxy"};
        for(int i = 0; i<PhoneNumber.length; i++)
        {
            System.out.println(association[PhoneNumber[i]]);
        }
    }
}
