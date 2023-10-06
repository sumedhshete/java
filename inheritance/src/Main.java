import java.lang.*;
import java.util.*;


class base
{
    public base()
    {
        System.out.println("This is base class.");
    }
}

class derived extends base
{
    public derived()
    {
        System.out.println("This is derived class.");
    }
}

class third extends derived
{
    public third()
    {
        System.out.println("This is third class.");
    }
}

class Main
{
    public static void main(String args[])
    {
       third t=new third();
    }
}