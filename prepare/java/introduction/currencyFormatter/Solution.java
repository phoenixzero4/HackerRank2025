package prepare.java.introduction.currencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();

        NumberFormat u = NumberFormat.getCurrencyInstance();

        Locale locale = new Locale( "en", "IN" );

        int rupee = ( '₹' );
        System.err.println( (char) rupee );
        String string = ( String.join( "", String.valueOf( rupee ), "" ) );
        System.err.println( string );
        NumberFormat i = NumberFormat.getCurrencyInstance( locale );
        String india = i.format( payment ).replace( string, "RS." );
        NumberFormat c = NumberFormat.getCurrencyInstance( Locale.CHINA );
        NumberFormat f = NumberFormat.getCurrencyInstance( Locale.FRANCE );

        System.out.printf( "US: %s\n", u.format( payment ) );
        System.out.printf( "India: %s\n", india );
        System.out.printf( "China: %s\n", c.format( payment ) );
        System.out.printf( "France: %s\n", f.format( payment ) );

    }

}
