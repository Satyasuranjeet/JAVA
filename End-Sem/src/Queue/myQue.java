//Queue using Array
package Queue;
import java.util.Scanner;
class Queue{
    static int arr[];
    static int front=0;
    static int back=0;
    static int capacity;
    Queue(int x){
        arr=new int[x];
        capacity=x;
    }
    static void enqueue(int x) {
        if (back == capacity) {
            System.out.println("Queue Overflow");
        } else {
            arr[back] = x;
            back++;
        }
    }
     static void display() {
         if (front>back) {
             System.out.println("Queue underflow");
         } else {
             for(int j=front;j<back;j++){
                 System.out.print(arr[j]+"->");
             }
             System.out.println();
         }
     }
    static void dequeue(){
        if (front >back) {
            System.out.println("Queue underflow");
        } else {
            for(int i=front+1;i<back;i++){
                arr[front]=arr[i];
            }
            front++;
        }
    }
}

public class myQue {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        Queue Q1 = new Queue(sc.nextInt());
        while(true){
            System.out.println("1:enqueue");
            System.out.println("2:dequeue");
            System.out.println("3:Display");
            System.out.println("4:Exit");
            int p=sc.nextInt();
            switch(p){
                case 1:{
                    System.out.println("Enter the element");
                    Q1.enqueue(sc.nextInt());
                    break;
                }
                case 2:{
                    Q1.dequeue();
                    break;
                }
                case 3:{
                    Q1.display();
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Invalid input");
                }
            }
        }



    }
}
