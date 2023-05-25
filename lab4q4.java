import java.util.Scanner;

class box{
    int length,breadth,height;

    void volume(){
       
       
         int vol=length*breadth*height;
         System.out.println(vol);
      
    }
    public class lab4q4{
        public static void main(String[]args){
            box obj=new box();
            
            
         Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
         int y=sc.nextInt();
         int z=sc.nextInt();
            obj.volume();
            System.out.println(x*y*z);
        }
    }
}
