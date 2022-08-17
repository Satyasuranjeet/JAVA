package prac;
class Complex{
    int real;
    int imag;
    void setdata(int x,int y){
        real=x;
        imag=y;
    }
    void display(){
        if(imag>0)
        System.out.println("The complex Number="+real+"i+"+imag+"j");
        else System.out.println("The complex Number="+real+"i"+imag+"j");
    }
    void add(Complex c1,Complex c2){
        real=c1.real+c2.real;
        imag=c1.imag+c2.imag;
    }
}
public class demo {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex c3=new Complex();
        c1.setdata(1,-1);
        c1.display();
        c2.setdata(2,11);
        c2.display();
        c3.add(c1,c2);
        c3.display();
    }
}
