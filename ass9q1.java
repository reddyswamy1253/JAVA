import java.util.Scanner;
 class check{

    int arr[][]=new int[10][2];

    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height and weight of 10 students");
        for(int i=0;i<10;i++){
            for(int j=0;j<2;j++){
                System.out.println("height=");
                
                arr[i][j]=sc.nextInt();
            }
        }
    }

    void weight(){
          int max=0,j=1,min=999;
          for(int i=0;i<10;i++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
            if(arr[i][j]<min){
                min=arr[i][j];
            
          }
          System.out.println("max weight="+max+"min weight="+min);
    }
}
    void height(){
        int max=0,j=1,min=999;
        for(int i=0;i<10;i++){
          if(arr[i][j]>max){
              max=arr[i][j];
          }
          if(arr[i][j]<min){
              min=arr[i][j];
          }
        }
        System.out.println("max height="+max+"min height="+min);
   }
}
   public class ass9q1{
    public static void main(String[]args){
        check c=new check();
        c.input();
        c.height();
        c.weight();
    }
   }
 

