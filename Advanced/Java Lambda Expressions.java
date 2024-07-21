/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-7*/

import java.io.*;
import java.util.*;
interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    PerformOperation isOdd() {
        PerformOperation performOperation = (int a) -> a % 2 == 0 ? false : true;
        return performOperation;
    }

    PerformOperation isPrime() {
        PerformOperation performOperation = (int a) -> {
            if (a == 1) {
                return true;
            } else {
                for (int i = 2; i < Math.sqrt(a); i++) {
                    if (a % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
        return performOperation;
    }

    PerformOperation isPalindrome() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        PerformOperation performOperation = (int a) -> {
            String string = Integer.toString(a);
            String rev = "";
            for (int i = string.length() - 1; i >= 0; i--) {
                rev = rev + string.charAt(i);
            }
            if (rev.equals(string)) {
                return true;
            }
            return false;
        };
        return performOperation;
    }
}
    public class Solution {

        public static void main(String[] args) throws IOException {
            MyMath ob = new MyMath();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            PerformOperation op;
            boolean ret = false;
            String ans = null;
            while (T-- > 0) {
                String s = br.readLine().trim();
                StringTokenizer st = new StringTokenizer(s);
                int ch = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                if (ch == 1) {
                    op = ob.isOdd();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "ODD" : "EVEN";
                } else if (ch == 2) {
                    op = ob.isPrime();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PRIME" : "COMPOSITE";
                } else if (ch == 3) {
                    op = ob.isPalindrome();
                    ret = ob.checker(op, num);
                    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

                }
                System.out.println(ans);
            }
        }
    }