class arithmatic_casting_imp{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        double result1 = a / b; // in this the result will return in the int first then return 3.0
        double result2 = (double) a / b; // in this the a is converted to double first then initiated


        System.out.println(result1);
        System.out.println(result2);
    }
}