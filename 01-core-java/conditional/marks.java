import java.util.Scanner;

public class marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter yout marks: ");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("Excellent");
        }
        else if(marks >= 75){
            System.out.println("Good");
        }
        else if(marks >= 60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
