class Car{
    String brand;
    String model;
    int year;
    int price;
    Car(String brand,String model,int year,int price){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.price=price;
    }
}
class Main {
    public static void main(String[] args) {
        Car c1=new Car("Honda","clara",2012,500000);
        Car c2=new Car("Ford","Nexus",2021,570000);
        Car c3=new Car("Tesla","Falcon",2025,900000);
        
        System.out.println("-----Car 1------");
        System.out.println("Brand : " + c1.brand);
        System.out.println("Model : " + c1.model);
        System.out.println("Year : " + c1.year);
        System.out.println("Price : " + c1.price);
        
        System.out.println("-----Car 2------");
        System.out.println("Brand : " + c2.brand);
        System.out.println("Model : " + c2.model);
        System.out.println("Year : " + c2.year);
        System.out.println("Price : " + c2.price);
        
        System.out.println("-----Car 3------");
        System.out.println("Brand : " + c3.brand);
        System.out.println("Model : " + c3.model);
        System.out.println("Year : " + c3.year);
        System.out.println("Price : " + c3.price);
        
        int a,b,c;
        a=c1.price;
        b=c2.price;
        c=c3.price;
        
        if (a>b && a>c){
            System.out.println("The Most Expensive car is : "+c1.brand);}
        else if (b>c){
            System.out.println("The Most Expensive car is : "+c2.brand);}
        else{
            System.out.println("The Most Expensive car is : "+c3.brand);}
    }
}
