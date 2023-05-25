abstract class shape{
    abstract void draw();
}
class rectangle extends shape{
    void draw(){
        System.out.println("drwing rectangle");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing circle");
    }
}
 public class abst{
    public static void main(String[]args){
        shape s=new rectangle();
        s.draw();
        shape x=new circle();
        x.draw();
    }
}
