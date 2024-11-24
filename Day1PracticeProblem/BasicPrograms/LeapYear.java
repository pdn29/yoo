import java.util.Scanner;

public class LeapYear {
    public boolean logic(int year){
        boolean ans  = false;
        if((year % 4 == 0 && year %100 != 0) || (year%400 == 0)){
            ans = true;
        }
        return ans;
    }
    public void leapyear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        boolean ans = logic(year);
        if(ans) System.out.println("This is a leap year ");
        else System.out.println("This is not a leap year");
    }
    public boolean leap(int year){
        return logic(year);
    }
}
