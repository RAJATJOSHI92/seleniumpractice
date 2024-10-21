class Base
{
    public void print()
    {
        System.out.println("base class");
    }
}
class Derived extends Base
{
    public void print()
    {

        System.out.println("derived class");
    }
}



public class overriding
{
    public static void main(String[] args)
    {
        Base b=new Base();
        Derived d=new Derived();

        b.print();
        d.print();

    }
}
