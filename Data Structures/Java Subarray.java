/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int boob_size = scanner.nextInt();
        int[] arr = new int[boob_size];
        for (int i = 0; i < boob_size; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int count_boob = 0;
        for (int i = 0; i < arr.length; i++){
            int total = 0;
            for (int j = i; j <arr.length; j++){
                total += arr[j];
                if (total < 0){
                    count_boob++;
                }
            }
        }
        System.out.println(count_boob);
    }
}