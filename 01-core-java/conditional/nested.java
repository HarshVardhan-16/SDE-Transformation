
public class nested 
{
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age > 18){
            if(hasID){
                System.out.println("Entry Allowed");
            }
            else{
                System.out.print("ID Required");
            }
        }
        else{
            System.out.print("Too Young");
        }
    }
}
