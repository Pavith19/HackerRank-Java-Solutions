/* *
* Author: Pavith Bambaravanage
* URL: https://github.com/Pavith19
* */

/*JAVA-08*/
import java.util.*;
import java.lang.reflect.*;
class Singleton{
    private Singleton(){

    }
    public String str;
    private static Singleton instance = null;
    public static Singleton getSingleInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
