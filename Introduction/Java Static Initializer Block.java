/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        boolean flag = B >0 && H > 0;

        if (!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            System.out.println(B*H);
        }
    }
}

