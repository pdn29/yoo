import java.awt.*;
import java.util.Scanner;

public class CheckEvenOdd {
    public void check(){
        System.out.println("enter the value! ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("this is a even value");
        }
        else{
            System.out.println("This is a odd value!");
        }

    }
}
