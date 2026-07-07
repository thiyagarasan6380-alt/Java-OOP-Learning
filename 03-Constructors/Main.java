class Student{
    String name;
    int age;
    String dept;
    Student(String Name,int Age,String Dept){
        name=Name;
        age=Age;
        dept=Dept;
    }
}
class Main {
    public static void main(String[] args) {
        Student s1=new Student("Rahul",20,"CSE");
        Student s2=new Student("Priya",19,"AI&DS");
        
        System.out.println("-----Student 1------");
        System.out.println("Name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Department : " + s1.dept);
        
        System.out.println("-----Student 2------");
        System.out.println("Name : " + s2.name);
        System.out.println("Age : " + s2.age);
        System.out.println("Department : " + s2.dept);
    }
}
