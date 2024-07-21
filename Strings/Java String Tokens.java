/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        string = string.trim();
        if (string.length() == 0){
            System.out.println(0);
        }
        else {
            String[] strings = string.split("[!,?._'@ ]+");
            System.out.println(strings.length);
            for(int i = 0; i <strings.length; i++){
                System.out.println(strings[i]);
            }
        }
    }
}