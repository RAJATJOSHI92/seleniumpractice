package randomprac;

import java.math.BigInteger;
import java.util.Scanner;

public class Biginteger {
    public static void main(String[] args)
    {
       Scanner s= new Scanner(System.in);
                 String number=s.next();
                 String value=s.next();
        BigInteger A= new BigInteger(number);
        BigInteger B= new BigInteger(value);
        BigInteger C= A.add(B);
        BigInteger D=A.multiply(B);
        System.out.println(C);
        System.out.println(D);



    }
}
