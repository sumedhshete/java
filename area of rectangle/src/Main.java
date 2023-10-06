import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter length and breadth of rectangle: ");
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a*b/2;
        System.out.println("The area of rectangle is: "+c);
    }
}