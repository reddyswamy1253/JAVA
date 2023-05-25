class A{
    void roll(){
        System.out.println("a call me method");
    }
}
class B extends A{
    void age(){
        System.out.println("b call me method");

    }
}
class C extends A{
    void subject(){
        System.out.println("c call me method");
    }
}
class ass8q2{
    public static void main(String[]args){
        A a=new A();
        B b=new B();
        C c=new C();
        a.roll();
        b.age();
        c.subject();
    }
}