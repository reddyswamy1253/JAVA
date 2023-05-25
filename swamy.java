import java.util.Scanner;

public class swamy{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int x=sc.nextInt();
        String digit="";

    
        

        switch(x){
                case 0:  digit="zero"+digit;
                break;
              
                case 1:  digit="one"+digit;
                break;
                case 2:  digit="two"+digit;
                break;
                case 3:  digit="three"+digit;
                break;
                case 4:  digit="four"+digit;
                break;
                case 5:  digit="five"+digit;
                break;
                case 6:  digit="six"+digit;
                break;
                case 7:  digit="seven"+digit;
                break;
                case 8:  digit="eight"+digit;
                break;
                case 9:  digit="nine"+digit;
                break;
                
        }
        System.out.println("number in words=   "+digit);
        

    }
}
