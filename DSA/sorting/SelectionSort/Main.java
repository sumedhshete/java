public class Main {

    void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int x=a[i];
            for(int j=0;j<i;j++)
            {
                if(x>a[j])
                    j++;
                a[j+1]=a[j];
                a[j]=x;

            }
        }
    }

    public static void main(String[] args) {
        int a[]={5,4,1,3,2};

        for(int x:a)
            System.out.println(x);

    }
}
