package prepare.java.strings.regex;

import java.util.Scanner;

class UsernameValidator {

    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}

public class Solution {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        int n = Integer.parseInt( in.nextLine() );
        while ( n-- > 0 ) {
            String user = in.nextLine();
            if ( user.matches( UsernameValidator.regularExpression ) ) {
                System.out.println( "Valid" );
            } else {
                System.out.println( "Invalid" );
            }
        }
        in.close();
    }
}