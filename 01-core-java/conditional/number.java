import java.util.Scanner;
public class number {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: " );
        int n = sc.nextInt();
        if(n>0){
            System.out.println("It's a Positive Number!!!");
        }
        if(n<0){
            System.out.println("It's a Negative Number!!!");
        }
        if(n==0){
            System.out.println("It's Zero!!!");
        }
        sc.close();
    }
}
