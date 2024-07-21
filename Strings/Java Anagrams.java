/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b){
        a = a.toUpperCase();
        b = b.toUpperCase();
        boolean anagram = false;
        StringBuilder stringBuilder = new StringBuilder(b);

        if (a.length() == b.length()){
            for (int i = 0; i < a.length(); i++){
                for (int j = 0; j < stringBuilder.length(); j++){
                    if (a.charAt(i) == stringBuilder.charAt(j)){
                        stringBuilder.deleteCharAt(j);
                        if (i==a.length() - 1 && stringBuilder.length() == 0){
                            anagram = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }

        return anagram;
    }
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();
        boolean bool = isAnagram(a, b);
        System.out.println((bool) ? "Anagrams":"Not Anagrams");
    }
}