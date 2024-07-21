/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++){
            String string = scanner.next();
            int j = scanner.nextInt();
            System.out.printf("%-15s%03d%n",string,j);
        }
        System.out.println("================================");
    }
}