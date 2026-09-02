
public class voter {
    public static void main(String[] args) {
        // int age = 21;                
        // int votingAge = 18;

        // Print these:

        // Eligible: true
        // Underage: false
        // Same Age: false

        int age = 21;
        int votingAge = 18;
        System.out.println("Eligible: " + (age > votingAge));
        System.out.println("Underage: " + (age < votingAge));
        System.out.println("Same Age: " + (age == votingAge));      
    }
}
