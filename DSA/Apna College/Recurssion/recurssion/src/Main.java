class Main
{

    static void print(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }

        return n*factorial(n-1);
    }

    static int sum(int n)
    {
        if(n==0)
            return 0;
        return n+sum(n-1);
    }

    static int fabonacci(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fabonacci(n-1)+fabonacci(n-2);
    }

    static int fabonacci2(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        int f1=fabonacci2(n-1);
        int f2=fabonacci2(n-2);
        return f1+f2;

    }

    static boolean sorted(int a[],int i)
    {
        if(i==a.length-1)
            return true;

        if(a[i]>a[i+1])
            return false;

        return sorted(a,i+1);
    }

    static int occurence(int a[],int i,int key)
    {
        if(i==a.length)
            return -1;
        if(a[i]==key)
            return i;
        return occurence(a,i+1,key);
    }

    static int lastoccurence(int a[],int i,int key)
    {
        if(i==-1)
            return -1;
        if(a[i]==key)
            return i;
        return lastoccurence(a,i-1,key);
    }

    static int power(int e,int n)
    {
        if(n==0)
            return 1;
        return e*power(e,n-1);

    }

    static int even(int e,int n)
    {
        if(n==0)
            return 1;
        int a=e*even(e,n-1);
        return a*2;
    }

    static int odd(int e,int n)
    {
        if(n==0)
            return 1;
        int a=e*odd(e,n-1);
        return a;
    }
    static int power2(int e,int n)
    {
        if(n%2==0)
            return even(e,n/2);
        int a= odd(e,n/2);
        return a*a*2;
    }


    public static void main(String[] args) {
        print(10);
        System.out.println(factorial(4)) ;
        System.out.println(sum(5));
        System.out.println(fabonacci(7));
        System.out.println(fabonacci2(7));
        int a[]={11,2,3,4,5,11,7,8,2};
        System.out.println(sorted(a,1));
        System.out.println(occurence(a,0,11));
        System.out.println(lastoccurence(a,a.length-1,2));
        System.out.println(power(2,7));


        System.out.println(power2(2,7));
    }
}