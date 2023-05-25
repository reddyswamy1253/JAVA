import java.util.Scanner;
public class lab4q1 {
    public static void main(String[]args){
        int x,y,z;
         Scanner sc=new Scanner(System.in);
         

         System.out.println("enter the firstnnumber:");
         int a = sc.nextInt();
         System.out.println("enter the second nnumber:");
         int b = sc.nextInt();
         System.out.println("enter the  third nnumber:");
         int c = sc.nextInt();

         if(a > b&& a > c){
            System.out.println("largest num is: "+a);
         }
         else if(b>c){
            System.out.println("largest number is: "+b);
         }
         else{
            System.out.println("largest number is: "+c);
         }    
    }
}
