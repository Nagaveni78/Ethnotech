/*interface upi
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
class Main 
{
    public static void main(String[] args)
    {
        balance b=new balance();
        b.ushow();
        b.pshow();
    }
}*/
interface notification
{
    void sendmessage(String message);
}
class mobilenotification implements notification{
    public void sendmessage(String message)
    {
        System.out.println("mobile notification is:"+message);
    }
}
class emailnotification implements notification{
    public void sendmessage(String message)
    {
        System.out.println("email notificationn is:"+message);
    }
}
class instanotification implements notification{
    public void sendmessage(String message)
    {
        System.out.println("insta notification is:"+message);
    }
}
class jobnotification implements notification{
    public void sendmessage(String message)
    {
        System.out.println("job notification is:"+message);
    }
}
class snapnotification implements notification{
    public void sendmessage(String message)
    {
        System.out.println("snap notification is:"+message);
    }
    
}
class  notificationcenter{
    public static void main(String[] args)
    {
        mobilenotification m=new mobilenotification();
        m.sendmessage("hello");
        emailnotification e=new emailnotification();
        e.sendmessage("job offer");
        instanotification i=new instanotification();
        i.sendmessage("sent a reel");
        snapnotification s=new snapnotification();
        s.sendmessage("Sent a snap");
        jobnotification j=new jobnotification();
        j.sendmessage("final reminder");
    }
}
