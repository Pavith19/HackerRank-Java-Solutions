/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    public static boolean Win(int leap, int[] game, int i){
        if (i >= game.length){
            return true;
        }
        if (i < 0 || game[i] == 1){
            return false;
        }
        game[i] = 1;
        return Win(leap,game, i+leap) || Win(leap,game,i+1)  || Win(leap, game, i-1);
    }
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        while (q-- > 0){
            int n =scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[n];
            for (int i =0; i < n; i++){
                game[i] = scanner.nextInt();
            }
            System.out.println((Win(leap,game,0)) ? "YES" : "NO");
        }
        scanner.close();
    }
}