import java.util.Scanner;

public class SwapTwoNumbers {

    public void swap(){
        System.out.println("enter the values to be swaped! ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = b;
        b = a;
        a =temp;
        System.out.println("the values of a and b after swaped are " + a + " "+ b);
    }
}
