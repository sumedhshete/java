import java.util.*;
import java.lang.*;

class Main
{
    public static void main(String []args)
    {
        System.out.println("Enter the row size and column size of array: ");
        int size;
        Scanner s=new Scanner(System.in);
        size=s.nextInt();

        int[][] m=new int[size][size];
        int [][] n=new int[size][size];
        System.out.println("Now enter elements of first matrix: ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                m[i][j]=s.nextInt();
            }
        }
        System.out.println("Now enter elements of second matrix: ");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                n[i][j]=s.nextInt();
            }
        }

        int [][]a=new int[size][size];

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                a[i][j]=m[i][j]+n[i][j];
                a[i][i]=0;
            }
        }

        System.out.println("The addition of two matrix is: ");

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.println(i+","+j+"="+a[i][j]);
            }
        }



    }
}