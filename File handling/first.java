import java.io.*;
class first
{
    public static void main(String []args)
    {
        try{
        FileOutputStream f=new FileOutputStream("E:/Java/File handling/fourth.txt");
        String s="This is the fourth attempt with for each loop.";
        byte []b=s.getBytes();
        for(byte x:b)
            f.write(x);


        f.close();
    }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}