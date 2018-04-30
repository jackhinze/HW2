import java.util.Scanner;

public class Problem2 {

    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int[] phonenumber = new int[7];
        for (int a=0; a<7; a++) {
            phonenumber[a] = reader.nextInt();
        }
        String[] numberMeaning = {"abc","def","ghi","jkl","mno","prs","tuv","wxy","   "};
        String[] numberLetters = new String[phonenumber.length];
        for(int b=0; b<7; b++){
            if (phonenumber[b]!=0){
                numberLetters[b] = numberMeaning[phonenumber[b]-2];
            }
            else if (phonenumber[b]==0){
                numberLetters[b] = " ";
            }
        }

        for (int i=0; i<numberLetters[0].length(); i++){
            for (int j=0; j<numberLetters[1].length(); j++) {
                for (int k=0; k<numberLetters[2].length(); k++){
                    for (int l=0; l<numberLetters[3].length(); l++){
                        for (int m=0; m<numberLetters[4].length(); m++){
                            for (int n=0; n<numberLetters[5].length(); n++){
                                for (int o=0; o<numberLetters[6].length(); o++){
                                    System.out.println(numberLetters[0].charAt(i)+""+numberLetters[1].charAt(j)+""
                                            +numberLetters[2].charAt(k)+""+numberLetters[3].charAt(l)+""
                                            +numberLetters[4].charAt(m)+""+numberLetters[5].charAt(n)+""
                                            +numberLetters[6].charAt(o)+"");
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
