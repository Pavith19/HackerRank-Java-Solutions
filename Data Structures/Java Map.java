/* *
* Author: Tonmoy Mondal
* URL: https://qinetique.github.io
* */

/*JAVA-15*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh){
        Map<String, Integer> myPhone = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++){
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            myPhone.put(name,phone);
            scanner.nextLine();
        }
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            if (myPhone.containsKey(string)){
                System.out.println(string + "="+myPhone.get(string));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}