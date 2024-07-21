/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++){
            int value = scanner.nextInt();
            linkedList.add(value);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            String string = scanner.next();
            if (string.equals("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                linkedList.add(index, value);
            }
            else if (string.equals("Delete")){
                int index = scanner.nextInt();
                linkedList.remove(index);
            }
        }
        for (Integer x : linkedList){
            System.out.printf(x+" ");
        }
    }
}