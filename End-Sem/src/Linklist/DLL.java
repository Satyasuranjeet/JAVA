package Linklist;
import java.util.Scanner;
class node{
    int data;
    node next;
    node prev;
}
public class DLL {
    static node hade,tail;
    static Scanner sc=new Scanner(System.in);
    static void create(){
        node temp=new node();
        System.out.println("Enter data");
        temp.data=sc.nextInt();
        temp.next=hade;
        hade=tail=temp;
        System.out.println("(Y/N)");
        char ch=sc.next().charAt(0);
        while(ch=='y'||ch=='Y'){
            node temp1=new node();
            System.out.println("Enter data");
            temp1.data=sc.nextInt();
            temp.next=temp1;
            temp1.prev=temp;
            temp=temp1;
            temp1=tail;
            System.out.println("(Y/N)");
            ch=sc.next().charAt(0);
        }
    }
    static void display(){
        node temp=hade;
        node temp3=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        while(temp3!=null) {
            System.out.println(temp3.data);
            temp = temp3.prev;
        }

    }

    public static void main(String[] args) {
        create();
        display();
    }
}
