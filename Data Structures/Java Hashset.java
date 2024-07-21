/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] left_pair = new String[t];
        String[] right_pair = new String[t];
        for (int i = 0; i < t; i++){
            left_pair[i] = scanner.next();
            right_pair[i] = scanner.next();

        }
        HashSet<String> hashSet = new HashSet<String>();
        for (int i = 0; i < t; i++){
            hashSet.add("("+left_pair[i]+", "+right_pair[i]+")");
            System.out.println(hashSet.size());
        }
    }
}