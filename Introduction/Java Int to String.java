/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String string = String.valueOf(n);

        if (n == Integer.parseInt(string)){
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}
