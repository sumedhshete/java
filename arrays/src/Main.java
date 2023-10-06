//find the largest element in an array
import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter size of array: ");
        int size;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        int a[]=new int[20];
        System.out.println("Now enter the elements of array: ");
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }
        int i=0;
        int max=a[0];
        while(i<size)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            i++;
        }
        System.out.println("The largest element is array is "+max);
    }
}