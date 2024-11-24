import java.util.Scanner;


public class HarmonicNumber {

    public void HN(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        if(n == 0){
            System.out.println("Please do not enter n value as 0 ");
        }
        else {
            double numberator = 0.0;
            double product = 1.0;
            for (int i = 1; i <= n; i++) product *= i;
            for (int i = 1; i <= n; i++) {
                numberator += (product / i);
            }
            double ans = (double) (numberator / product);
            System.out.println(ans);
        }
    }
}
