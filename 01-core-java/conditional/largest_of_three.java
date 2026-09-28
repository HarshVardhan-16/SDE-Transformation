public class largest_of_three {
    public static void main(String args[]){
      
        int a = 10;
        int b = 9;
        int c = 14;

        if(a > b && a > c){
            System.out.println("A is Bigger");
        }
        else if (b > a && b > c){
            System.out.println("B is Bigger");
        }
        else if(a == b && b == c){
        System.out.println("All number are same");
        }
        else{
        System.out.println("C is Bigger");
        }
    }
}
