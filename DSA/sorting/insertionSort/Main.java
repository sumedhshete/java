public class Main {
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void insertion(int a[])
    {
       for(int i=1;i<a.length;i++)
       {
           int j=i-1;
           int x=a[i];
           while(j>-1&&a[j]>x)
           {
               a[j+1]=a[j];
               j--;
           }
           a[j+1]=x;
       }


    }



    public static void main(String[] args) {
        int a[]={5,4,1,3,2};

        insertion(a);
        for(int x:a)
            System.out.println(x);

    }
}
