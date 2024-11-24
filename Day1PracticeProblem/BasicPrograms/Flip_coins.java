import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Flip_coins {

    public void flip_coins(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of chances! ");
        int chances = sc.nextInt();
        int temp = chances;
        int  tails = 0;int heads =0;
        while(chances > 0) {
            double rand = Math.random();
            if (rand < 0.5) {
                System.out.println("Tails");
                tails +=1;
            } else {
                heads +=1;
                System.out.println("Heads");
            }
            chances -=1;
        }
        double percentage_heads = ((heads) * 100)/temp;
        double percentage_tails = ((tails)*100) / temp;
        System.out.println("percentage of heads is " + percentage_heads);
        System.out.println("percentage of tails is " + percentage_tails);
    }
}
