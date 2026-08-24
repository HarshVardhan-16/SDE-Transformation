public class Out_Of_Bound {
     public static void main(String[] args) {

        byte a = 127;   // ✅ fits
        // byte b = 128;  // ❌ OUT OF BOUNDS

        int c = 128;    // ✅ fits
        int d = 100000; // ✅ fits

        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}
