/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-7*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int xcs = Integer.parseInt(scanner.nextLine());
        while (xcs > 0){
            String string = scanner.nextLine();
            try{
                Pattern.compile(string);
                System.out.println("Valid");
            }
            catch (Exception e){
                System.out.println("Invalid");
            }
            xcs--;
        }
    }
}