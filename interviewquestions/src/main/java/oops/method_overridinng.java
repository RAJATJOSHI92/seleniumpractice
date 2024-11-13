package oops;

public class method_overridinng
{
    public  void sum(int a,int b)
    {
        System.out.println("addition of a and b from 1 "+(a+b));
    }

}

class m2
{
    public void sum(int a,int b)
    {
        System.out.println("addition of a and b from m "+(a+b));
    }
}

class pp
{
    public static void main(String[] args) {
        method_overridinng m= new method_overridinng();
                m2 mm= new m2();
        m.sum(10,20);
        mm.sum(10,20);
    }
}