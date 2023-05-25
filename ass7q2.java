import java.util.Scanner;
class shape{
    double area;
    void showarea(double a){
              System.out.println("area="+area);
    }
}
class circle extends shape{
    void carea(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("area of circle is="+area);

    }
}
class rectangle extends shape{
    void rarea(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length=");
        double l=sc.nextDouble();
        System.out.println("enter the breadth=");
        double b=sc.nextDouble();
        double area=l*b;
        System.out.println("area of rectangle="+area);
    }
}
public class ass7q2{
    public static void main(String[]args){
        circle c=new circle();
        c.carea();
        rectangle r=new rectangle();
        r.rarea();
    }
}


    
       
