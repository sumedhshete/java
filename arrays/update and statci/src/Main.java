import java.lang.*;
import java.util.*;

class Main {
    public static void update(int a[],int x)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]+1;
            x=6;
        }
    }
    public static void main(String[] agrs)
    {
        int []a={95,96,97};
        int nonChangeable=2;
        update(a,nonChangeable);
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);

    }
        System.out.println(nonChangeable);
    }

}