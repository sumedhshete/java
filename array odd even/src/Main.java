import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String []args)
    {
        System.out.println("Enter size of array :");
        int size;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        int []a=new int[20];
        System.out.println("Now enter actual elements of array: ");
        for(int i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }



        int odd=0,even=0;

        for(int i=0;i<size;i++)
        {
            if(a[i]%2==0)
                even++;
            else
                odd++;
        }

        System.out.println("The no of even elements are: "+even);
        System.out.println("The no of odd elements are: "+odd);

    }
}