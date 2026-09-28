import java.util.Scanner;

public class Slab {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Units: ");
        int units = sc.nextInt();
        int rate = 1;
        if(units <= 100){
            rate = units *5;
            if(units >= 101 && units <=200){
                rate= units*7;
            }
                if (units >= 201 && units <=400) {
                    rate = units * 10;
                }
                if (units> 400) {
                    rate = 15 * units;
                }
            
        }
        System.out.println(rate);
    }
}
