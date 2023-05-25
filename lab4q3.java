import java.util.*;

class circle{
    double a;
    public double area(int r)
    {
        a=3.14*r*r;
        return a;
    }
}

class square{
    int a;
    public double area(int s)
    {
        a=s*s;
        return a;
    }

}
class triangle{
    double a;
    public double area(int b, int h)
    {
        a=0.5*b*h;
        return a;
    }
}
public class lab4q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        do
        {
            System.out.println("1 to circle area");
            System.out.println("2 to square area");
            System.out.println("3 to trianglea area");
            System.out.println("0 to exit");
            a = sc.nextInt();
            if(a==1)
            {
                circle c = new circle();
                System.out.print("enter radius : ");
                int r=sc.nextInt();
                double q = c.area(r);
                System.out.println("Area = "+q);
            }
            else if(a==2)
            {
                square c = new square();
                System.out.print("enter side : ");
                int r=sc.nextInt();
                double q = c.area(r);
                System.out.println("Area = "+q);
            }else if(a==3)
            {
                triangle c = new triangle();
                System.out.print("enter base and height : ");
                int b=sc.nextInt();
                int h=sc.nextInt();
                double q = c.area(b,h);
                System.out.println("Area = "+q);
            }
        }while(a==0);
        sc.close();
    }
}

