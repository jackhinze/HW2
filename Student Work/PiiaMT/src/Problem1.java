import java.util.Scanner;

public class Problem1 {

    public static int longestlength(String[] words){
        int longest = 0;
        for (int i=0; i<words.length; i++){
            if (words[i].length()>longest){
                longest=words[i].length();
            }
        }
        return longest;
    }

    public static String printsStuff(int howMany, String what){
        String returnee="";
        for (int b=0; b<=howMany; b++){
            returnee=returnee+what;
        }
        return returnee;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sentence = reader.nextLine();
        String[] words = sentence.split(" ");
        int L = longestlength(words);
        System.out.println("+"+printsStuff(L+1, "-")+"+");
        for (int i=0; i<words.length; i++){
            int emptyness=L-words[i].length();
            System.out.println("| "+words[i]+printsStuff(emptyness, " ")+"|");
        }
        System.out.println("+"+printsStuff(L+1, "-")+"+");
    }
}
