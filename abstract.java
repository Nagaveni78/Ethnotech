abstract class foodorder
{
    String customername;
    int quality;
    double price;
    foodorder()
    {
        System.out.println("welcome to our food ordering system");
    }
    foodorder(String name,int quality,int price)
    {
        this.customername=name;
        this.quality=quality;
        this.price=price;
    }
    abstract void orderfood();
}
class pizza extends foodorder
{
    pizza(String name,int quality,int price)
    {
        super(name,quality,price);
    }
     void orderfood()
    {
        System.out.println("oder is covered");
    }
    void generatebill()
    {
        double total=quality*price;
        System.out.println("customer name:"+customername);
        System.out.println("quality:"+quality);
        System.out.println("price per item:"+price);
    }
}
class abstract{
public static void main (String[] args) {
   pizza p=new pizza("nagaveni",6,100);
   p.generatebill();
   p.orderfood();
}
}