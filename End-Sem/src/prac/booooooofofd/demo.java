package prac.booooooofofd;
/*
Create a class with data members name and age.
 Use an appropriate constructor to initialize the data members.
 A Person is of two types
 a) Technical Officer
 b) Product Manager .
 Class Technical Officer contains data members as name, Employee ID and Department.
 Class Product Manager  contains data members as name and Employee ID.
 Write a display method to display
 all details of Technical officer and Product manager.
 */
import java.awt.*;
import java.util.Scanner;
class op{
    String name;
    int age;
    op(String n,int x)
    {
        this.name=n;
        this.age=x;
    }
}
class Technical_Officier extends op {
    int Employee_id;
    String Department;

    Technical_Officier(String n, int x, int id, String s) {
        super(n, x);
        this.Department = s;
        this.Employee_id = id;
    }
    void display(){
        System.out.println("Technical Officier :");
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(this.Department);
        System.out.println(this.Employee_id);
    }
}
class product_manager extends op {
    int Employee_id;

    product_manager(String n, int x, int id) {
        super(n, x);
        this.Employee_id = id;
    }

    void display() {
        System.out.println("Project manager :");
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(this.Employee_id);

    }
}
public class demo{
    public static void main(String[] args) {
        Technical_Officier t=new Technical_Officier("Satya",18,2141010033,"backend");
        product_manager p=new product_manager("mitu",18,2141010036);
        t.display();
        p.display();
    }
}


