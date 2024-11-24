import java.awt.*;
import java.util.Scanner;

public class quotientAndRemainder {

    public void qandr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b ) {
            int temp = b;
            b = a;
            a = b;
        }
        int q = b/a;
        int r = b%a;
        System.out.println("the quotient and remainder are " + q + " " + r);
    }
}
