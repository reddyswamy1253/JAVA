import java.util.*;

class Number
{
    int n;
    int a[]= new int[n];
    void read()
    {
        System.out.println("Enter the size:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }

    void swap()
    {
        int temp=a[0];
        int l=0;
        int s=99;
        int x=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>l)
            {
                temp=a[i];
                l=i;
            }
            if(a[i]<s)
            {
                x=a[i];
                s=i;
            }
        }
        int t;
        t=temp;
        x=temp;
        t=x;
    }

    void display()
    {
        System.out.println("Array after swapping the largest and smallest number:");
        for(int i=0;i<n;i++)
        System.out.println(a[i]);
    }
    
}
public class ass6q1
{
    public static void main(String args[])
    {
        Number ab = new Number();
        ab.read();
        ab.swap();
        ab.display();
    }
}
