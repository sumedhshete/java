import java.util.ArrayList;

public class Main
{

    static void swap(ArrayList<Integer>a,int i,int j)
    {
        int temp=a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        swap(list,3,4);
        System.out.println(list);
    }
}
