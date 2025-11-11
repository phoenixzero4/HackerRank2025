package prepare.java.datastructures.javaarraylist;



import java.util.ArrayList;
import java.util.Scanner;

public class Solution2
	{
		public static void main( String[] args )
			{
				Scanner in = new Scanner( System.in ); // read from standard input
				int n = in.nextInt(); // number of lists
				ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

				// read all lists
				for ( int i = 0; i < n; i++ )
					{
						int d = in.nextInt(); // number of elements in this list
						ArrayList<Integer> list = new ArrayList<>();
						for ( int j = 0; j < d; j++ )
							{
								list.add( in.nextInt() );
							}
						lists.add( list );
					}

				int q = in.nextInt(); // number of queries
				// process each query
				for ( int i = 0; i < q; i++ )
					{
						int x = in.nextInt() - 1; // list index (1-based to 0-based)
						int y = in.nextInt() - 1; // element index (1-based to 0-based)
						if ( x < lists.size() && y < lists.get( x ).size() )
							{
								System.out.println( lists.get( x ).get( y ) ); // print element
							} else
							{
								System.out.println( "ERROR!" ); // invalid index
							}
					}
			}
	}
