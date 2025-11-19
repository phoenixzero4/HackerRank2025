package prepare.java.introduction.currencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    // only works prior to Java 15, otherwise you have a bitch of a time dealing with the ASCII
    // 'rupee' symbol

    public static void main( String[] args ) {
        /* Read input */
        Scanner scanner = new Scanner( System.in );
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India. */

        Locale indiaLocale = new Locale( "en", "IN" );

        /* Create NumberFormats using Locales */
        NumberFormat us = NumberFormat.getCurrencyInstance( Locale.US );
        NumberFormat india = NumberFormat.getCurrencyInstance( indiaLocale );
        NumberFormat china = NumberFormat.getCurrencyInstance( Locale.CHINA );
        NumberFormat france = NumberFormat.getCurrencyInstance( Locale.FRANCE );

        System.out.println( "US: " + us.format( payment ) );
        System.out.println( "India: " + india.format( payment ) );
        System.out.println( "China: " + china.format( payment ) );
        System.out.println( "France: " + france.format( payment ) );
    }
}
