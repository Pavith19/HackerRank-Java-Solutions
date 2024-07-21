/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 != 0){
            System.out.println("Weird");
        }
        else {
            if (n >= 2 && n <= 5){
                System.out.println("Not Weird");
            }
            else if (n >= 6 && n <=20){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
        }
    }
}
