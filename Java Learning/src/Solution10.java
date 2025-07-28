import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class Solution10 {
        @SuppressWarnings("ConvertToTryWithResources")
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale INDIA = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        // Write your code here.\
        NumberFormat formattedUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formattedUS.format(payment);
        
        NumberFormat formattedINDIA = NumberFormat.getCurrencyInstance(INDIA);
        String india = formattedINDIA.format(payment);

        NumberFormat formattedCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formattedCHINA.format(payment);

        NumberFormat formattedFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formattedFRANCE.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
