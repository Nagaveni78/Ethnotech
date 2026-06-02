class animal
{
    void sound()
    {
        System.out.println("boww");
    }
}
class dog extends animal
{
    void eating()
    {
        System.out.println("chicken");
    }
}
class inheritance{
public static void main (String[] args) {
    {
        dog d=new dog();
        d.sound();
        d.eating();
    }
}
}