public class increasing_triangle_pattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1 ;j <=i ; j=j+1){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 1 - *
// 2 - **
// 3 - ***
