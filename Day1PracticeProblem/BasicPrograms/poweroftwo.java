import java.util.Scanner;

public class poweroftwo {
    public void pof2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value! ");
        int n = sc.nextInt();
        LeapYear ly = new LeapYear();
        if(0<=n && n < 31) {
            for (int i = 0; i <= n; i++) {
                int temp = (int) Math.pow(2, i);
                String isleap = "";
                boolean ans = ly.logic(temp);
                if(ans) {
                    isleap = "This is a leap Year! ";
                }
                else{
                    isleap = "This is not a leap year ";
                }
                System.out.println(temp + " " + isleap);
            }
        }
        else{
            System.out.println("please enter n value below 32 ");
        }
    }

}
