/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        String string;
        int i = 1;
        while (scanner.hasNext()){
            string = scanner.nextLine();
            System.out.println(i + " " + string);
            i++;
        }
    }
}