/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
