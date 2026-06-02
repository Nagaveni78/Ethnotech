class employee
{
    void salary()
    {
        System.out.println("60000");
    }
}
class Role extends employee
{
    void role()
    {
        System.out.println("frontend developer");
    }
}
class Work extends employee
{
    void position()
    {
        System.out.println("team leader");
    }
    public static void main(String[] args)
    {
        Role r=new Role();
        Work s=new Work();
        r.salary();
        r.role();
        s.position();
    }
}