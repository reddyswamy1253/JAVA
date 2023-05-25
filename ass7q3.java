import java.util.Scanner;
public class ass7q3{
    public static void main(String[]args){
    
        
        Scanner sc=new Scanner(System.in);
        int  arr[] = new int[5];
        System.out.println("enter the values:");


        
        for(int i=0;i<=arr.length;i++){
        
            arr[i]=sc.nextInt();
        }
int s=0;
for(int i=0;i<=5;i++){
    if(arr[i]%2==1){
         s=s+arr[i];
    }
}
    System.out.println(s);
     }
    
}

