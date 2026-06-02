import java.util.*;
class bank_balance
{
    private int balance;
    public void details(int balance)
    {
         this.balance=balance;
    }
    public int getbalance()
    {
        return balance;
    }
    public static void main(String[] args)
    {
   	 Scanner s=new Scanner(System.in);
       	 int balance=s.nextInt();
         bank_balance b1=new bank_balance();
         b1.details(balance);
         System.out.println(b1.getbalance());
    }
}
    