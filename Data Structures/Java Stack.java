/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.next();
            while(string.length() != (string = string.replaceAll("\\(\\)|\\[\\]|\\{\\}","")).length());
            System.out.println(string.isEmpty());
        }
    }
}