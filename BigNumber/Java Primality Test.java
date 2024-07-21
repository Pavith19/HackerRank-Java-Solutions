/* *
* Author: Pavith Bambaravanage
* URL: https://github.com/Pavith19
* */

/*JAVA-15*/

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(10)?"prime":"not prime");
    }
}
