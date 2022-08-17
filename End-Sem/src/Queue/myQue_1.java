//Queue using linklist
package Queue;
import java.util.Scanner;

class Node {
    int info;
    Node next;
Node(){
    next=null;
}
}
class lop {
    Node first;
    Node last;
    lop(){
        first=last=null;
    }
    void enqueue(int c){
        Node temp=new Node();
        temp.info=c;
        if(first==null){
            first=last=temp;
        }
        else{

            last.next=temp;
            last=temp;
        }
    }
    void dequeue() {
        if (first == null){
            System.out.println("Queue underflow");
            return;
        }
        first = first.next;
        if (first == null)
            last = null;

    }
    void display(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.info);
            temp=temp.next;
        }

    }
}
public class myQue_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lop mk = new lop();
        while (true) {
            System.out.println("1:enqueue");
            System.out.println("2:dequeue");
            System.out.println("3:Display");
            System.out.println("4:Exit");
            int p = sc.nextInt();
            switch (p) {
                case 1: {
                    System.out.println("Enter the element");
                    mk.enqueue(sc.nextInt());
                    break;
                }
                case 2: {
                    mk.dequeue();
                    break;
                }
                case 3: {
                    mk.display();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
