import java.util.Scanner;
public class HW2_1 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        StringArray a;
        a = new StringArray();
        //Brings each sentence into an array
        while(scan.hasNext())
        {
            a.add(scan.next());
        }

        //Checks for largest word

        int Word = a.array[0].length();

        for(int x = 0; x < a.size; x++)
        {
            if(Word < a.array[x].length())
            {
                Word = a.array[x].length();
            }
        }

        String Sentence1 = "+--";

        for(int b = 0; b < Word; b++)
        {
            Sentence1 = Sentence1 + "-";
        }

        Sentence1 = Sentence1 + "+";

        System.out.println(Sentence1);

        for(int y = 0; y < a.size; y++)
        {
            String Sentence2 = "| ";
            Sentence2 = Sentence2 + a.array[y];
            for(int d = 0; d < (Word - a.array[y].length()); d++)
            {
                Sentence2 = Sentence2 + " ";
            }
            Sentence2 = Sentence2 + " |";
            System.out.println(Sentence2);
        }
        System.out.println(Sentence1);

    }
}
