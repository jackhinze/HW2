import java.util.Scanner;

public class SentenceBox {
    public static void main(String[]args){
        System.out.println("How many words are in the sentence?");
        Scanner sysIn= new Scanner(System.in);
        int input= sysIn.nextInt();
        String[] list= new String[input];
        for(int k=0; k<list.length;k++){
            list[k]= sysIn.next();
        }
 box(list);
    }
    private static void box(String[] list){
        String longest = list[0];
        for(int i=1; i<list.length; i++){
            String tempList= list[i];
            if(tempList.length() > longest.length()){
                longest = tempList;
            }

        }
        int maxNum= longest.length();
        String dashes="";
        for(int g=0; g<maxNum;g++){
            dashes+="-";
        }
        System.out.println("+" + dashes + "+");
        String spaceDisplay="";

        for(int h=0; h < list.length; h++){
            int spaceNum= longest.length()-list[h].length();
            for(;spaceNum>0;spaceNum--){
                spaceDisplay+=" ";
            }
            System.out.println("|"+ list[h]+ spaceDisplay+"|");
            spaceDisplay="";
        }
        System.out.print("+"+ dashes+"+");
    }
}
