import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Sentence = scan.nextLine();
        String[] wordy = Sentence.split(" ");
       Problem1.Sentence(wordy);
    }

    private static int LongestWord(String[] Sentence) //Want to find longest word
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

    public static void Sentence(String[] LongWord) {
        System.out.print("+");
        int n = Problem1.LongestWord(LongWord);
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for(int i = 0; i < LongWord.length; i++) {
            System.out.print("| " + LongWord[i]);
            for(int j = 0; j <= n - LongWord[i].length(); j++)
            {
               System.out.print(" ");

            }
            System.out.println("|");
        }
        System.out.print("+");
        for (int i = 0; i < n + 2; i++) {
            System.out.print("-");
        }
        System.out.print("+");
    }
    }
