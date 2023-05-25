import java.util.Scanner;
public class ass6q2{
    public static void main(String[]args){
    int n;
        {
            Scanner sc= new Scanner(System.in);

            System.out.println("enter the no of students:");
            int a=sc.nextInt();
        
        
            for(int i=1;i<=a;i++){
                System.out.println("enter the roll number:");
        int b=sc.nextInt();

        System.out.println("enter the name:");
        String name=sc.next();
        
            
            System.out.println("cgpa:");
            Double d=sc.nextDouble();
            if(d<=3){
                System.out.println(name+"   is having lowest cgpa:");
            
            }
        
          }
       
}
}
}

