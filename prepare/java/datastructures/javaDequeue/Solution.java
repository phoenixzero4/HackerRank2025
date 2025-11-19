package prepare.java.datastructures.javaDequeue;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main( String[] args ) throws IOException{

        Scanner in = new Scanner( System.in );

        int n = in.nextInt();
        int m = in.nextInt();

        ArrayDeque<Integer> deck = new ArrayDeque<>();

        for ( int i = 0; i < n; i++ ) {
            deck.add( in.nextInt() );

        }

        int max = 0;
        int elem = deck.peek();
        while ( deck.size() > 0 ) {
            Set<Integer> set = new HashSet<>();
            for ( int i = 0; i < deck.size(); i++ ) {
                set.add( deck.peek() );
                set.add( deck.peek() );
                set.add( deck.peek() );
                elem = deck.pop();

            }
            max = Math.max( set.size(), max );
            set.remove( elem );
        }
        // }
        System.out.println( max );

    }

}
