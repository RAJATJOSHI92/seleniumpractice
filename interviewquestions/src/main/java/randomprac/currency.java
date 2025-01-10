package randomprac;

import java.util.*;
import java.text.*;

 class currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here
        Locale usformat =Locale.US;
        Locale chinaformat =Locale.CHINA;
        Locale franceformat =Locale.FRANCE;
        Locale indiaformat =new Locale("en","In");

        NumberFormat uspay = NumberFormat.getCurrencyInstance(usformat);
        NumberFormat chinapay  = NumberFormat.getCurrencyInstance(chinaformat);
        NumberFormat francepay = NumberFormat.getCurrencyInstance(franceformat);
        NumberFormat indiapay = NumberFormat.getCurrencyInstance(indiaformat);
        String us = uspay.format(payment);
        String china = chinapay.format(payment);
        String france = francepay.format(payment);
        String india = indiapay.format(payment);




        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}