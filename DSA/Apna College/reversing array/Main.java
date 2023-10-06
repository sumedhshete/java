import java.lang.*;
import java.util.*;

public class Main {

    static int [] reverse(int a[])
    {
       int z;
       for(int i=0;i<(a.length)/2;i++)
       {
           z=a[i];
           a[i]=a[a.length-1-i];
           a[a.length-1-i]=z;

       }
       return a;
    }

    public static void main(String[] args) {



        int a[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));

        System.out.println("");


    }
}
