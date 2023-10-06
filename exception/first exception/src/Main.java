import java.lang.*;

class Main
{
    public static void main(String[] args) {
        try
        {
          int  a=1;
          int  b=0;
           int c=a/b;
        }

        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}