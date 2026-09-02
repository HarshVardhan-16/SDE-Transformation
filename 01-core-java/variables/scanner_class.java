import java.util.Scanner;

public class scanner_class {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        sc.close();
    }
}
