/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

import java.util.Scanner;

class Solution{
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int soln = a;
            for (int j = 0; j < n; j++){
                soln += (int) (Math.pow(2, j) * b);
                System.out.print(soln + " ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}