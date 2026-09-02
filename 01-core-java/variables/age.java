import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter your Age: ");
         int age = sc.nextInt();
        System.out.print("Enter your Marks: ");
         int marks = sc.nextInt();    
         System.out.println("Eligible: " +(age >= 18 && marks >= 60));
    }
}
