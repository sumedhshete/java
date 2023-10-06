class Main
{

    public static void change(int a[],int i,int val)
    {
        if(i==a.length)
        {
            printarr(a);
            System.out.println();
            return;
        }


        a[i]=val;
        change(a,i+1,val+1);
        a[i]=a[i]-2;
    }
    public static void printarr(int a[])
    {
        for(int x:a)
            System.out.print(x+" ");
    }

    public static void main(String[] args) {
         int a[]=new int[5];
         change(a,0,1);
         printarr(a);
    }
}