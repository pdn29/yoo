import java.util.Scanner;

public class Factors {

    public void fact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number :) ");
        int n = sc.nextInt();
        int temp = n;
        System.out.println("The prime factarization of the number " + n  + " is ");
        for(int i =2 ;i*i <= n;i++) {
            int cnt = 0;
            while (temp >= i && temp % i == 0 ) {
                cnt++;
                temp = temp / i;
            }

            if (cnt > 0) System.out.println(i + " power " + cnt);
        }
        if(temp > 1) System.out.println(temp + " power 1");
    }
}
