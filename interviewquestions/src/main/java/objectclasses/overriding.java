package objectclasses;

public  class overriding {

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        System.out.println("parent");
    }
}
   abstract class derived extends overriding{
       public void sum(int a, int b) {
           int sub = a - b;
           System.out.println(sub);
           System.out.println("derived");
       }
   }
 class derived2 extends derived{
    public void sum(int a, int b) {
        int mul = a * b;
        System.out.println(mul);
        System.out.println("derived2");
    }
}
   class  test {
       public static void main(String[] args) {
           derived2 d = new derived2();
           overriding r=new overriding();

          // r.sum(10,10);
           //d=new derived2();
           d.sum(10,10);
       }
   }
