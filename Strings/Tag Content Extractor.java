/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-7*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        //String string = in.nextLine();
        int testCases = Integer.parseInt(in.nextLine());
        Pattern pattern = Pattern.compile("<([^>]+)>([^<]+)</\\1>");
        while(testCases>0){
            String line = in.nextLine();
            //Write your code here
            Matcher matcher = pattern.matcher(line);
            int m =0;
            while (matcher.find()){
                m++;
                System.out.println(matcher.group(2));
            }
            if (m == 0){
                System.out.println("None");
            }
            testCases--;
        }
    }
}