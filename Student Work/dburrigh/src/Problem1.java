import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Sentence = scan.nextLine();
    }

    private static int LongestWord(String[] Sentence)
    {
        int LongestWord = 0;
        for(int w = 0; w < Sentence.length; w++) //w = Word of Sentence
        {
            if(Sentence[w].length()>LongestWord)
            {
                LongestWord = Sentence[w].length();
            }
        }
        return LongestWord;
    }

    public static void Sentence(String LongestWord) {
        System.out.print("+");
        int n = LongestWord.length();
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        //System.out.println("| " + Sentence + " |");
        System.out.print("+");
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
    }
