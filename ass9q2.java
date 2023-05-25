import java.util.Scanner;

class BankDeposit{
    Scanner sc = new Scanner(System.in);
    String []cs ={"Ravi", "Maya", "Varun", "Riya", "Tauseef","moksha","reddy","thirumala"};
    int ar[]={100, 500, 50, 300, 400,700,200,400};
    public void withdraw(){
        System.out.println("enter customer id");
        int a= sc.nextInt();
        if(a>5) System.out.println("not found");
        System.out.println("Name = "+cs[a-1]+" Balance = "+ar[a-1]);
        System.out.println("enter amount to withdraw:");
        int b = sc.nextInt();
        ar[a-1]=ar[a-1]-b;
        System.out.println("Transaction Successfull");
        System.out.println("id = "+a+" Name = "+cs[a-1]+" Balance = "+ar[a-1]);
    }
    public void ShowDetails(){
        System.out.println("CUS.ID\tName\tInitialD");
        for(int i=0;i<5;i++)
        {
            System.out.println(i+1+"\t"+cs[i]+"\t"+ar[i]);
        }
    }
}
public class ass9q2 {
    public static void main(String[] args) {
        BankDeposit B = new BankDeposit();
        B.ShowDetails();
        B.withdraw();
    }
}
