/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-7*/

import java.util.Scanner;

class Solution{
    public static void main(String[] argh){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String ipv4 = scanner.next();
            System.out.println(ipv4.matches(new IPV4().string));
        }
    }
}
class IPV4{
    String ipv4regex = "^(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    public String string = ipv4regex;
}