import java.util.Scanner;

public class lab4q2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [] num=new int[10];
        System.out.println("enter the numbers:");
        for(int i=0;i<10;i++){
            num[i]=sc.nextInt();

        }
        int even=0;
        int odd=0;
        for(int i=0;i<10;i++){
            if(num[i]%2==0){
                even++;
                
            }else odd++;
        }
        System.out.println("odd = "+odd+    "   even = "+even);
        
    }
}
