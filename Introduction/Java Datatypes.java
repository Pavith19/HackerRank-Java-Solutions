/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

import java.util.Scanner;

class Solution{
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int tony = scanner.nextInt();

        for (int i = 0; i < tony; i++){
            try {
                long l = scanner.nextLong();
                System.out.println(l + " can be fitted in:");
                if (l >= -128 && l <=127){
                    System.out.println("* byte");
                }
                if (l >= -Math.pow(2,15) && l <= Math.pow(2,15) - 1){
                    System.out.println("* short");
                }
                if (l >= -Math.pow(2,31) && l <= Math.pow(2,31) - 1){
                    System.out.println("* int");
                }
                if (l >= -Math.pow(2,63) && l <= Math.pow(2,63) - 1){
                    System.out.println("* long");
                }
            }
            catch (Exception e){
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }
        }
    }
}