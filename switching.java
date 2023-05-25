import java.util.Scanner;

public class switching{
    public static void main(String[]args){
               Scanner sc=new Scanner(System.in);
               System.out.println("1.area of square:");
               System.out.println("2.area of circle:");
               System.out.println("1.area of triangle:");
               System.out.println("\n enter your choice:");
               switch(sc.nextInt())
               {
                case 1:
                System.out.println("enter the side");
                double s=sc.nextDouble();
                System.out.println("the area of square is:"+s*s);
                break;
                case 2:
                System.out.println("enter the length:");
                double l=sc.nextDouble();
                System.out.println("enter the breadth:");
                double b=sc.nextDouble();
                System.out.println("the area of triangle is: "+l*b);
                break;
                case 3:
                System.out.println("enter the radius :");
                double r=sc.nextDouble();
                System.out.println("the area of square is:"+3.14*r*r);
                break;
               }
    
    
    }
}