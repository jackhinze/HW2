public class numberVariationsTest {
    public static void main (String[] args){
        String[] numberLetters={"abc"," ","ghi"};
        for (int i=0; i<numberLetters[0].length(); i++){
            for (int j=0; j<numberLetters[1].length(); j++) {
                for (int k=0; k<numberLetters[2].length(); k++){
                    System.out.println(numberLetters[0].charAt(i)+""+numberLetters[1].charAt(j)
                            +""+numberLetters[2].charAt(k));
                }
            }
        }
    }
/* Since this gives the same result as the example I would say that my 2 can work without recursion
  even though it seems quite foolish with seven nested for loops but oh well = )
*/
}
