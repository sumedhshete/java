import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter the sides of triangle: ");
        float a,b,c,s;
        double d;
        Scanner g=new Scanner(System.in);
        a=g.nextFloat();
        b=g.nextFloat();
        c=g.nextFloat();
        s=(a+b+c)*0.5f;
        d=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle is "+d);
    }

}