import java.util.Scanner;

public class LargestAmoungthree {
    public void largestamoungthree(){
        System.out.println("enter the three values! ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp =Integer.MIN_VALUE;
        temp = Math.max(a,b);
        temp = Math.max(temp,c);
        System.out.println("The largest Value is " + temp);

    }
}
