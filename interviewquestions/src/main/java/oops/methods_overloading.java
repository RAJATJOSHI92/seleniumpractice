package oops;

 public class methods_overloading

{
    public int a;

    public void sum()
    {
        System.out.println("sum called");
    }

    public void sum(int a)
    {
        System.out.println("a is "+a);
    }

    public void sum(int a,int b)
    {
        System.out.println("sum of a and b is"+(a+b));
    }

    public void sum(int a,int b, int c)
    {
        System.out.println("sum of a and b is"+(a+b+c));
    }
}

class program
{
    public static void main(String[] args)
    {
        methods_overloading m= new methods_overloading();
        m.sum();
        m.sum(10);
        m.sum(10,20);
        m.sum(10,20,30);
    }
}
