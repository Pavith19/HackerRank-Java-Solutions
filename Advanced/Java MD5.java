/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-7*/

import java.security.MessageDigest;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes());
            byte[] digest = messageDigest.digest();
            for (byte b : digest){
                System.out.printf("%02x", b);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}