import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter the no :");
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int b=1;
        for(int i=1;i<=a;i++)
        {
            b=b*i;
        }
        System.out.println("Factorial is "+b);
    }
}