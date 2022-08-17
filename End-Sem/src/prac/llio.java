package prac;

import java.util.ArrayList;
import java.util.Scanner;
class sum{
    static int add(int x,int y){
       return x+y;
    }
}
public class llio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> p = new ArrayList<Object>();
        while (true) {
            System.out.println("0:Exit");
            System.out.println("1:create");
            System.out.println("2:display");
            switch (sc.nextInt()) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    p.add(new sum());
                    break;
                }
                case 2:
                    System.out.println("Size" + p.size());
            }
        }
    }
}
