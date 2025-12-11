package hackerRank2025.regex;

import java.io.File;
import java.util.Scanner;

class Solution{

    public static void main(String[] args) throws Exception{
    	
    	File file = new File("regex.txt");
    	Scanner input = new Scanner(file);
    	
    	while(input.hasNext()) {
    	    String IP = input.next();
            System.out.println(IP.matches(new MyRegex().pattern));
    	}
    	
    	input.close();
  //      Scanner in = new Scanner(System.in);
   //     while(in.hasNext()){
  //          String IP = in.next();
  //          System.out.println(IP.matches(new MyRegex().pattern));
  //      }

    }
}
class MyRegex {
   public static String pattern = "^(\\d{1,2}\\.|[01]\\d{2}\\.|2[0-4]\\d\\.|25[0-5]\\.){3}(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])$";
}
