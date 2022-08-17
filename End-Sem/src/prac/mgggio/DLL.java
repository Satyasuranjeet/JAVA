package prac.mgggio;
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

        while(temp!=null){
            System.out.println(temp.data);
            tail=temp;
            temp=temp.next;
        }

    }
    static void insertfirst()
    {
        node temp=new node();
        System.out.println("Enter data");
        temp.data=sc.nextInt();
        temp.next=hade;
        hade.prev=temp;
        hade=temp;
    }
    static void insertlast(){
        node temp=hade;
        while(temp.next!=null){
            temp=temp.next;
        }
        node temp1=new node();
        System.out.println("Enter data");
        temp1.data=sc.nextInt();
        temp.next=temp1;
        temp1.prev=temp;
        temp1.next=null;
    }
    static void insertany(){
        node temp=hade;
        System.out.println("Enter the index");
        int k=sc.nextInt();
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        node temp1=new node();
        node temp3;
        System.out.println("Enter data");
        temp1.data=sc.nextInt();
        temp3=temp.next;
        temp.next=temp1;
        temp1.prev=temp;
        temp1.next=temp3;
        temp3.prev=temp1;
    }
    static void deletefirst(){
        hade=hade.next;
        hade.prev=null;
    }
    static void deletelast(){
        node temp=hade;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void main(String[] args) {
        create();
        display();
        insertfirst();
        display();
        insertlast();
        display();
        insertany();
        display();
        System.out.println("Df");
        deletefirst();
        display();
        System.out.println("Dl");
        deletelast();
        display();
    }
}
