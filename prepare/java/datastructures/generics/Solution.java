package prepare.java.datastructures.generics;

public class Solution<E> {





    public static void main( String[] args ) {


        String[] s = { "Gloria", "Brodi", "Kirra" };
        Integer[] i = { 1, 5, 2, 4, 3 };

        printArray( s );
        printArray( i );

    }

    public static <E> void printArray( E[] arr ) {
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print( arr[i] + " " );

        }
        System.out.println();
    }
}
