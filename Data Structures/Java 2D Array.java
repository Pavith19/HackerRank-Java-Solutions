/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[6][6];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                a[i][j] = scanner.nextInt();

            }
        }
        scanner.close();
        int maxima = Integer.MIN_VALUE;
        for (int i=0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int total = a[i+0][j+0]+a[i+0][j+1]+a[i+0][j+2]+a[i+1][j+1]+a[i+2][j+0]+a[i+2][j+1]+a[i+2][j+2];
                maxima = Math.max(maxima, total);

            }
        }
        System.out.println(maxima);
    }
}