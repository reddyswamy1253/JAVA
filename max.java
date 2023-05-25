import java.util.*;
public class max {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        System.out.println("enter the third number:");
        int c=sc.nextInt();

        int z=Math.max(a,b);
        System.out.println("the biggest number is:" +z);

    }
}
