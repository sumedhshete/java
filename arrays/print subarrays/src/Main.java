import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String []args)
    {
        int[]a={2,4,6,8,10};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                for(int k=i;k<j;k++)
                    System.out.println(a[k]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}