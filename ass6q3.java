import java.util.Scanner;
public class ass6q3{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 1 to cal area of triangle");
        System.out.println("enter 2 to cal area of square");
        System.out.println("enter 3 to cal area of circle");

        int num=sc.nextInt();
        switch(num){
            case 1:
            System.out.println("enter the length and breadth:");
            Double length= sc.nextDouble();
            Double height= sc.nextDouble();
            Double area=(length*height)/2;
            System.out.println("the area of triangle is:"+area);
            break;
            case 2:
            System.out.println("enter the side:");
            Double side=sc.nextDouble();
            Double area1=side*side;
            System.out.println("the area of square is:"+area1);
            break;
            case 3:
            System.out.println("enter the radius:");
            Double radius=sc.nextDouble();
            double area2=sc.nextDouble();
            System.out.println("the area of square is:"+area2);

            break;

            default:
            System.out.println("wrong entry");

        }
    }
}
