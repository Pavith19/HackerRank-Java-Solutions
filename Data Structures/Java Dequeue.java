/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            int a = scanner.nextInt();
            deque.add(a);
            hashSet.add(a);
            if (deque.size() ==m){
                if (hashSet.size() > max){
                    max = hashSet.size();
                }
                int x = (int) deque.remove();
                if (!deque.contains(x)){
                    hashSet.remove(x);
                }
            }
        }
        System.out.println(max);
    }
}