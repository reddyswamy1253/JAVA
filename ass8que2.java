class A{
    void x(){
        System.out.println("dynamic:");
    }
}

class B extends A{
    void x(){
        System.out.println("dispatch");
    }
}
class C extends A{
    void x(){
        System.out.println("method");

    }
}
public class ass8que2{
    public static void main(String[]args){
        A a=new A();

        B b=new B();

        C c=new C();

        a.x();
        b.x();
        c.x();
   }
}