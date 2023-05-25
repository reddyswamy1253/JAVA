import java.util.Scanner;
public class user {
    public static void main(String[] args){
        
        double area;
        
        double circumference;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the radius");
       int r=sc.nextInt();
       area=3.14*r*r;
       circumference=2*3.14*r;
       System.out.println("area of the circle is"+area);
       System.out.println("area of the circle is"+circumference);

    }
    
}
