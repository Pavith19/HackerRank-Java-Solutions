/* *
* Author: Pavith Bambaravanage
* URL: https://github.com/Pavith19
* */

/*JAVA-15*/

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < n; i++){
            for (int j = i; j >= 1; j--){
                if (new BigDecimal(s[j]).compareTo(new BigDecimal(s[j-1])) > 0){
                    String string = s[j];
                    s[j] = s[j - 1];
                    s[j-1] = string;
                }
                else {
                    break;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
