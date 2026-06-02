interface upi
{
    void ushow();
}
interface payment
{
    void pshow();
}
class balance implements upi,payment
{
    public void ushow()
    {
        System.out.println("upi transaction");
    }
    public void pshow()
    {
        System.out.println("payment details");
    }
}
class interfaces 
{
    public static void main(String[] args)
    {
        balance b=new balance();
        b.ushow();
        b.pshow();
    }
}