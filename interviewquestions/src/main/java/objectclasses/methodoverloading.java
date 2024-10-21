package objectclasses;

public class methodoverloading {
    int a;
    int b;
    int c;
   public  methodoverloading (int v1,int v2,int v3)
   {
       this.a=v1;
       this.b=v2;
       this.c=v3;
   }

    public methodoverloading() {
        System.out.println("mai suoper hu");
    }

    public void sum(int a,int b)
   {
      this.a=a;
      this.b=b;
     int sum=a+b;
       System.out.println(sum);
   }
    public void sum(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        int sum=a+b+c;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        methodoverloading m=new methodoverloading(10,20,30);
       m.sum(m.a,m.b);
        m.sum(m.a,m.b, m.c);
        methodoverloading m1=new methodoverloading(20,20,30);
        m.sum(m1.a,m1.b);
       m.sum(m1.a,m1.b, m1.c);
    }
}

