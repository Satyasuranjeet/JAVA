package Linklist;
import java.util.*;
class Node{
    int info;
    Node next;
}
public class SLL {
    static Node hade;
    static Scanner sc = new Scanner(System.in);

    static void create() {
        Node temp = new Node();
        System.out.println("Enter 3 digit no");
        temp.info = sc.nextInt();
        temp.next = hade;
        hade = temp;
        System.out.println("Do you want to enter more data ? (Y/N)");
        char ch = sc.next().charAt(0);
        while (ch == 'y' || ch == 'Y') {
            Node temp2 = new Node();
            System.out.println("Enter 3 digit no");
            temp2.info = sc.nextInt();
            temp.next = temp2;
            temp = temp2;
            System.out.println("Do you want to enter more data ? (Y/N)");
            ch = sc.next().charAt(0);
        }
    }

    static void display() {
        Node temp = hade;
        while (temp != null) {
            System.out.print(temp.info + "->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    static void insertbigg() {
        Node temp = new Node();
        System.out.println("Enter 3 digit no");
        temp.info = sc.nextInt();
        temp.next = hade;
        hade = temp;
    }

    static void insertend() {
        Node temp = hade;
        Node temp2 = new Node();
        System.out.println("Enter 3 digit no");
        temp2.info = sc.nextInt();
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = temp2;
        temp = temp2;
    }

    static void insertany() {
        Node temp = hade;
        System.out.println("Enter the index");
        int k = sc.nextInt();
        System.out.println("Enter 3 digit no");
        Node temp2 = new Node();
        temp2.info = sc.nextInt();
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        Node temp3 = temp.next;
        temp.next = temp2;
        temp2.next = temp3;
    }

    static void deletefirst() {
        hade = hade.next;
    }

    static void deletelast() {
        Node temp = hade;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    static void deleteany() {
        Node temp = hade;
        System.out.println("Enter the index");
        int k = sc.nextInt();
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    static void reverce() {
        Node temp = hade;
        int c = 0;
        ArrayList<Integer> p = new ArrayList<>();
        while (temp != null) {
            p.add(temp.info);
            c++;
            temp = temp.next;
        }
        temp = hade;
        while (temp != null) {
            temp.info = p.get(c - 1);
            c--;
            temp = temp.next;
        }
    }
    static void midsum(){
        Node temp=hade;
        int sum=0;
        while(temp!=null){
            sum+=(temp.info/10)%10;
            temp=temp.next;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        create();
        display();
        midsum();
    }
}
