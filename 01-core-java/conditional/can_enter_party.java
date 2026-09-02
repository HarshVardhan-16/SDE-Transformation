public class can_enter_party {
    public static void main(String[] args) {
        int age = 17;
        boolean hasParentPermission = true;

        System.out.println("can Enter: "+ (age >= 18 || hasParentPermission));
        System.out.println("Needs Permission: "+ (age <= 18 && !hasParentPermission));
    }
}
