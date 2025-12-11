package prepare.java.strings.regex;

import java.util.Scanner;

public class Solution {
    public static void main( String[] args ) throws Exception {

        Scanner sc = new Scanner( System.in );
        sc.useDelimiter( "\\A" );
        String s = sc.hasNext() ? sc.next() : "";
        sc.close();

        s = s.replaceAll( "^[^A-Za-z]+|[^A-Za-z]+$", "" );

        if ( s.isEmpty() ) {
            System.out.println( 0 );
            return;

        }
        String[] tokens = s.split( "[^A-Za-z]+" );

        System.out.println( tokens.length );

        for ( String t : tokens ) {
            System.out.println( t );
        }

    }
}