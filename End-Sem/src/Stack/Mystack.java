//Stack using array.
package Stack;
import java.util.Scanner;
class Stack {
    static int arr[];
    static int cap;
    static int size;

    Stack(int x) {
        arr = new int[x];
        cap = x;
        size = -1;
    }
    static boolean Isempty() {
        return size == -1;
    }

    static boolean Isfull() {
        return size == cap - 1;
    }

    static void push(int k) {
        if (Isfull()) {
            System.out.println("Stack Overflow");
        } else {
            size++;
            arr[size] = k;

        }
    }

    static void pop() {
        if (Isempty()) {
            System.out.println("Stack UnderFlow");
        } else {
            System.out.println(arr[size]);
            size--;
        }
    }

    static void Display() {
        if (Isempty()) {
            System.out.println("No Item to display");
        } else {
            for (int i = size; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

    public class Mystack {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the stack");
            Stack s = new Stack(sc.nextInt());
            while (true) {
                System.out.println("1:Push");
                System.out.println("2:Pop");
                System.out.println("3:Display");
                System.out.println("4:Exit");
                int b = sc.nextInt();
                switch (b) {
                    case 1: {
                        System.out.println("Enter the element to be pushed");
                        s.push(sc.nextInt());
                        break;
                    }
                    case 2: {
                        s.pop();
                        break;
                    }
                    case 3: {
                        s.Display();
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
