

public class handling{
    public static void main(String[]args){
    
        try{
           
            int data=100/0;
        }
 
        catch(ArithmeticException e){
            System.out.println(e);
        
        }
        try{
            String s=null;
            System.out.println(s.length());

          }catch(NullPointerException e){
            System.out.println(e);

            System.out.println("null");
        }
        System.out.println("code");
        System.out.println("1223");
    }
    
}