package objectclasses;

class fun1
{
    int add=0;
    public  fun1(int a, int b)
    {
        add=a+b;
        System.out.println("sum of two number is "+add);
    }
    public  fun1(int c, int d,int e)
    {
        this(c,d);
        add=c+d+e;
        System.out.println("sum of three number is "+add);
    }
        }

public class thisfun {
    public static void main(String[] args) {
        fun1 f = new fun1(2, 3, 2);

    }
}
