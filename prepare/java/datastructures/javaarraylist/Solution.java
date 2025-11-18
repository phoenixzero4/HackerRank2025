package prepare.java.datastructures.javaarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{

    public static void main( String[] args ) throws Exception
    {
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();

        // File file = new File( "arraylist.txt" );
        // Scanner in = new Scanner( file );

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        // while ( in.hasNext() )
        // {
        // int n = in.nextInt();

        for ( int i = 0; i < n; i++ )
        {
            int d = in.nextInt();
            list = new ArrayList<>();
            for ( int j = 0; j < d; j++ )
            {

                list.add( in.nextInt() );

            }
            lists.add( list );
        }

        int q = in.nextInt();
        for ( int i = 0; i < q; i++ )
        {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;

            if ( x < lists.size() && y < lists.get( x ).size() )
            {

                System.out.println( lists.get( x ).get( y ) );
            } else
            {
                System.out.println( "ERROR!" );
            }
        }
                in.close();
    }
    // }
}