package objectclasses;

public class Constructor {
    int v1;
    int v2;

    public Constructor(Constructor c1) {
        this.v1 = c1.v1;
        this.v2 = c1.v2;

    }
    public Constructor(int a, int b) {
        this.v1 = a;
        this.v2 = b;

    }

    public int sum() {
        int sum = v1 + v2;
        return sum;
    }


    public static void main(String[] args) {
        Constructor c=new Constructor(10,20);
        Constructor c1=new Constructor(c);
        System.out.println(c1.sum());



    }
}
