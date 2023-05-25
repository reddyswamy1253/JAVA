/*import java.io.*;
import java.util.*;
public class file{
    public static void main(String[]args)throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        FileWriter fw=new FileWriter("lab1.txt");
        fw.write(s);
        fw.close(); 
        FileReader fr=new FileReader("abc.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.println((char)i);
        }
  fr.close();

    }
}*/

import java.io.*;
import java.util.*;
public class file{
    public static void main(String[]args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file name to be copied");
        String s=sc.nextLine();
        FileReader fr=new FileReader(s);
        FileWriter fw=new FileWriter("123.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.println((char)i);
        }
        fr.close();
        fw.close();

    }
}