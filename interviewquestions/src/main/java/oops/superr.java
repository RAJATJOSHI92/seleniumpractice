package oops;

public class superr
{
    int sss=90;

    public superr()
    {
        System.out.println("supper");
    }

    public  superr(int a)
    {
        System.out.println("super called "+a);
    }
    public void sum(int a,int b)
    {
        System.out.println((a+b));
    }

}


class sub extends superr
{
    public  sub()
    {
        super();

        System.out.println("sub called");

    }
    public  sub(int a)
    {
      // super(a);
         this();
        System.out.println("sub called"+a);

    }

    public  sub( int a, int b)
    {

       // super(a);
        this(a);
        System.out.println("from sub"+(a+super.sss));

    }

    public  sub( int a, int b,int c)
    {

        this(a,b);
        System.out.println("from sub"+(a+b+c));

    }
    public  void sum(int c, int d, int e)
    {
        super.sum(c,d);

        System.out.println((c+d+e));

    }

}

class hh
{
    public static void main(String[] args)
    {
        superr s=new superr(22);
        sub ss= new sub(10,20,45);
        ss.sum(10,20,30);
    }
}