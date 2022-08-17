package prac;
import java.util.Scanner;
class Node{
    int info;
    Node next;
}
public class Satya{
    static Scanner sc=new Scanner(System.in);
    static Node hade;
    static void create(){
        Node temp=new Node();
        System.out.println("Enter the data");
        temp.info=sc.nextInt();
        temp.next=hade;
        hade=temp;
        System.out.println("Do you want to enter more data ? (Y/N)");
        char ch = sc.next().charAt(0);
        while (ch == 'y' || ch == 'Y') {
            Node temp2=new Node();
            System.out.println("Enter the data");
            temp2.info=sc.nextInt();
            temp.next=temp2;
            temp=temp2;
            System.out.println("Do you want to enter more data ? (Y/N)");
            ch = sc.next().charAt(0);
        }
    }
    static void display(){
        Node temp = hade;
        while (temp != null) {
            System.out.print(temp.info + "->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {
        create();
        display();
    }
}