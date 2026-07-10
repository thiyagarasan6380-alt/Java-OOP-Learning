import java.util.*;

class Factorial {
    public static void main(String[] args){
        long n,temp,fact=1;
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(temp>0){
            fact=fact*temp;
            temp=temp-1;
        }
        System.out.println("Factorial of "+n+" : "+fact);
        sc.close();
    }
}
