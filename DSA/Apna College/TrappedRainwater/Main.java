class Main
{

    static int trappedWater(int []a)
    {
        int water=0;
        int []leftmax=new int[a.length];
        int []rightmax=new int[a.length];
        leftmax[0]=a[0];
        rightmax[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<leftmax[i-1])
            {
                leftmax[i]=leftmax[i-1];
            }
            else
            {
                leftmax[i]=a[i];
            }
        }
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]<rightmax[i+1])
            {
                rightmax[i]=rightmax[i+1];
            }
            else {
                rightmax[i]=a[i];
            }
        }

        int []c=new int[a.length];
        int []d=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=Math.min(leftmax[i],rightmax[i]);
        }
        for(int i=0;i<a.length;i++)
        {
            d[i]=c[i]-a[i];
        }
        for (int i=0;i<a.length;i++)
        {
            water+=d[i];
        }


        return water;
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int second[]={4,2,3,5};
        System.out.println(trappedWater(height));
        System.out.println(trappedWater(second));
    }
}