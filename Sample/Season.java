import java.util.Scanner;

class Season{
    public static void main(String[] args) {
        
        while(true){
        String a;
        Scanner sc=new Scanner(System.in);
        String Month[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        System.out.print("Enter a month : ");
        a=sc.nextLine();
        if (a.equals(Month[0])|a.equals(Month[1])|a.equals(Month[10])|a.equals(Month[11])){
           
            System.out.println("Winter Season");
        }
        else if (a.equals(Month[2])|a.equals(Month[3])|a.equals(Month[4])|a.equals(Month[5])){
            System.out.println("Rainy Season");
        }
        else if (a.equals(Month[6])|a.equals(Month[7])|a.equals(Month[8])|a.equals(Month[9])){
            System.out.println("Summer Season");
        }
        
        sc.close();
    }
    }
}
