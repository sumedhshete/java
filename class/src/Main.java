import java.util.*;
import java.lang.*;

class rectangle
{
    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        return 2*(length+breadth);
    }


}

class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter the length of the rectangle: ");
        int l ;
        int b;
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        b=s.nextInt();
        rectangle r=new rectangle();
        r.length=l;
        r.breadth=b;
        System.out.println("The perimeter of rectangle is "+r.perimeter());
        System.out.println("The area of rectangle is "+r.area());
    }
}