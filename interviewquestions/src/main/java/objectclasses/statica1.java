package objectclasses;

public class statica1 extends methodoverloading
{
    int d;
    public statica1() {
        super();
        System.out.println("hello");
        super.sum(10,20,30);
    }
    public statica1(int v1, int v2)
    {
         this();
        this.a=v1;
        this.b=v2;
    }

    public statica1(int v1, int v2,int v3,int v4)
    {
        super(v1,v2,v3);
        this.d=v4;

    }
    public void sum1(int a,int b)
    {
        this.a=super.a;
        this.b=b;
        int sum=a+b;
        System.out.println(sum);
    }
    public void sum(int s, int s3,int v3,int v4) {
        this.a=s;
        this.b=s3;
        this.c=v3;
        this.d=v4;
        int sum=a+b+c+d;
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
      statica1 s1=new statica1(10,20,30,40);
        statica1 s2=new statica1(10,20);
           s1.sum(10,10,10,10);
           s1.sum1(s1.a,s1.b);



    }

}
