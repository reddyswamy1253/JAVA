public class finallykey{
    public static void main(String[]args){
        try{
            int data=20/0;
        }catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("i love you");
        }
    }
}