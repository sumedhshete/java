import java.io.*;

class read
{
    public static void main(String []args)
    {
        try{
            FileInputStream fis=new FileInputStream("E:/Java/File handling/first.txt");
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}