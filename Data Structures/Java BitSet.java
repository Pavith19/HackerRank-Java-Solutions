/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet[] bitSets = new BitSet[]{new BitSet(n), new BitSet(n)};
        for (int i = 0; i < m; i++){
            String string = scanner.next();
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            if (string.equals("AND")){
                bitSets[l].and(bitSets[r]);
            }
            if (string.equals("OR")){
                bitSets[l].or(bitSets[r]);
            }
            if (string.equals("XOR")){
                bitSets[l].xor(bitSets[r]);
            }
            if (string.equals("FLIP")){
                bitSets[l].flip(n - r - 1);
            }
            if (string.equals("SET")){
                bitSets[l].set(n - r -1);
            }
            System.out.println(bitSets[0].cardinality()+" "+bitSets[1].cardinality());
        }
    }
}