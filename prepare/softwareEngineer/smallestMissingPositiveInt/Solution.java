package prepare.softwareEngineer.smallestMissingPositiveInt;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

class Result {

    /*
     * Complete the 'findSmallestMissingPositive' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive( List<Integer> orderNumbers ) {

        orderNumbers.sort( null);
        System.out.println( orderNumbers );

        int cur, answer = 0;

        for ( int i = 0; i < orderNumbers.size(); i++ ) {
            cur = orderNumbers.get( i );

            if ( orderNumbers.get( i + 1 ) - cur > 1 && cur != -1 ) { return cur + 1; }

        }




    }

}

public class Solution {
    public static void main( String[] args ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        int orderNumbersCount = Integer.parseInt( bufferedReader.readLine().trim() );

        List<Integer> orderNumbers = IntStream.range( 0, orderNumbersCount ).mapToObj( i -> {
            try {
                return bufferedReader.readLine().replaceAll( "\\s+$", "" );
            } catch ( IOException ex ) {
                throw new RuntimeException( ex );
            }
        } ).map( String::trim ).map( Integer::parseInt ).collect( toList() );

        int result = Result.findSmallestMissingPositive( orderNumbers );

        System.out.println( result );

        bufferedReader.close();
    }
}
