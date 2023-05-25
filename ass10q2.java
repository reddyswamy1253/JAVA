class Super{
    String s=null;
    Super(){
        
    try{
        System.out.println(s.length());
    }
    catch(NullPointerException e){
        System.out.println("Super class exception");
    }
    }
}
class Sub extends Super{
    String q=null;
    Sub(){
        
    try{
        System.out.println(q.length());
    }catch(NullPointerException e){
        System.out.println("Sub class exeption");
    }
}
}

public class ass10q2 {
    public static void main(String[] args) {
    Sub s = new Sub();    
    }
}
