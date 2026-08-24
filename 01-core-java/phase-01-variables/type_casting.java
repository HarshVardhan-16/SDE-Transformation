public class type_casting {
    public static void main (String[] args)
    {

        //Type Casting 
        //Widening - It is automatically done by Java (Nothing is lost in it)

        int x = 10;
        double y = x;

        //Narrowing Casting - We have to do it manually (There are chances of losing)
        double z = 10.67;
        int u = (int)z;

        double price = 10.99;
        int round_price = (int) price;
        System.out.println(round_price);
    }
}