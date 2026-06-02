class bank
{
	protected int balance;
	public bank(int balance)
	{
		this.balance=balance;
	}
	public void displayinfo()
	{
	    System.out.println("balance :"+balance);
	}
}
class account extends bank
{
    int ac_no;
    public account(int ac_no, int balance)
    {
        this.ac_no = ac_no;
        super(balance);
    }
    @Override
    public void displayinfo()
    {
        System.out.println("account number:"+ac_no);
        super.displayinfo();
    }
     void deposit(int amount)
	{
	   balance+=amount;
	   System.out.println("after deposite balance is :"+balance);
	}
	void withdraw(int amount)
	{
	    balance-=amount;
	    System.out.println("after withdraw balance is"+balance);
	}
	public static void main(String[] args)
	{
	    account b =new account(1234,10000);
	    b.displayinfo();
	    b.deposit(10000);
	    b.withdraw(1000);
	}
}