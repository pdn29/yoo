import java.util.Scanner;

public class CheckWhetherAlphabetisVowelConsonant {
    public void vora(){
        System.out.println("Enter the Character! ");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'U' || a == 'A' || a=='E' || a == 'I' || a == 'O' || a =='U'){
            System.out.println("this is a Vowel ");
        }
        else{
            System.out.println("This is a Alphabet!");
        }
    }
}
