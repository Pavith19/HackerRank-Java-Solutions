/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.reset();
        messageDigest.update(scanner.nextLine().getBytes(StandardCharsets.UTF_8));
        for (byte i : messageDigest.digest()){
            System.out.printf("%02x",i);
        }
    }
}