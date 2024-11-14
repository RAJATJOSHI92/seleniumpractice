package oops;

 abstract class time
{

    protected time()
    {
        System.out.println("time comstructor");
    }
   abstract public void hello();

   public void time()
   {
       System.out.println("time from abstract");
   }


}

class date extends time
{

    public date()
    {
        super();
        System.out.println("constructor from date");
    }
    @Override
    public void hello()
    {
        System.out.println("hello implementation from date");
    }


}


public class abssttract
{
    public static void main(String[] args)
    {
        date d= new date();
        d.hello();
        d.time();

        time t= new date();
        t.time();

    }
}