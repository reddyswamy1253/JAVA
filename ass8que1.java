import java.util.*;
abstract class student{
       abstract void course();
       int roll_no,reg_no;
}
class kiitian extends student{
    void course(){

    }
}
public class ass8que1{
    public static void main(String[]args){
        student s=new kiitian();
        s.course();
    }
}