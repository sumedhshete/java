import java.util.*;
import java.lang.*;

class create 
{
    public static void main(String[] args) {
        System.out.println("hi");
        //add element
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);

        //get element

        int a=list.get(0);
        System.out.println(a);

        //remove element

        list.remove(1);
        System.out.println(list);

        //set element at a perticular index

        list.set(2,10);
        System.out.println(list);

        System.out.println(list.contains(10));

        // add element at a index and extend the list

        list.add(1,9);
        System.out.println(list);
        
        //size of list;

        System.out.println(list.size());

        //print all the elements using for loop

        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //print reverse of array list

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }

        //find max in arraylist

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            int b=list.get(i);
            if(b>max)
                max=b;
        }

        System.out.println("the max element is "+max);

        //swap two numbers;

        // int c=1;
        // int d=3;

        // Swap(list, c,d);
        // System.out.println(list);

        Collections.sort(list); 

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());


    }
}