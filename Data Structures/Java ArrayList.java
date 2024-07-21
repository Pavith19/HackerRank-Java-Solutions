/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int d = scanner.nextInt();
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            for (int j = 0; j < d; j++){
                arrayList1.add(scanner.nextInt());
            }
            arrayList.add(arrayList1);
        }
        int q = scanner.nextInt();
        for (int k = 0; k < q; k++){
            int sex = scanner.nextInt();
            int sexy = scanner.nextInt();
            ArrayList<Integer> arrayList1 = arrayList.get(sex - 1);
            if (sexy <= arrayList1.size()){
                System.out.println(arrayList1.get(sexy-1));
            }
            else {
                System.out.println("ERROR!");
            }
        }
    }
}