/* *
* Author: Pavith Bambaravanage
* URL: https://github.com/Pavith19
* */

/*JAVA-7*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(string.substring(start, end));
    }
}
