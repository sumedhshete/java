import java.util.Stack;

class Main
{
    public static void pushAtBottom(Stack<Integer>s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void reverse(String s)
    {

    }



    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s,10);
        System.out.println(s);
        String str="hdemuS";


    }
}