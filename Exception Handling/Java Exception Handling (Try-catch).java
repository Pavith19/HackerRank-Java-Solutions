/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x/y);
        }
        catch (Exception e){
            if (e instanceof ArithmeticException){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            else {
                System.out.println("java.util.InputMismatchException");
            }
        }
        scanner.close();
    }
}