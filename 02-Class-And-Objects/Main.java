class Student{
    String name;
    int age;
    String dept;
}
class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        
        s1.name="Rahul";
        s1.age=20;
        s1.dept="CSE";
        
        s2.name="Priya";
        s2.age=19;
        s2.dept="AI&DS";
        
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
