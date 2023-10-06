import java.lang.*;
import java.util.*;


public class Main {
    //prime number:

    public static void main(String[] args) {
        boolean flag=true;
        int x=0;
        if(x==2)
            System.out.println("True");
        else {
            for (int i = 2; i <= Math.sqrt(x); i++) //consider this.
            {
                if (x % i == 0)
                    flag = false;
                break;
            }
            System.out.println(flag);
        }
    }
}
