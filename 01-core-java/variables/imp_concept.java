public class imp_concept {
    public static void main(String[] args) {
        int a = 7;
    int b = 2;

    System.out.println(a / b);
    System.out.println((double) a / b);
    System.out.println(a / (double) b);
    System.out.println((double)(a / b));

    // (double)(a / b)   // divide first, cast later
    // (double)a / b     // cast first, divide later
    }
}
