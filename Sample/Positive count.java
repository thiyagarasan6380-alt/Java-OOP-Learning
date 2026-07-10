import java.util.Scanner;

class PositiveCount{
    public static void main(String[] args) {
        
        int n,count=0;
        System.out.print("Enter positive no count :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0){
            count=count+n;
        }
        else if(n<0){
            System.out.println("Please enter only a positive number");
        }
        sc.close();
    }
        
    }
