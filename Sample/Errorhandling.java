import java.util.*;
import java.util.InputMismatchException;

class ErrorException {
    public static void main(String[] args){
        
        try{
            int n;
            System.out.print("Enter a number :");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            sc.close();
        }
        catch (InputMismatchException e) {
            
        System.out.println("You can only assign input datatype");
        }
    }
}
