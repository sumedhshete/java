class Main {

    static void reverse(int x)
    {
        while(x!=0)
        {
            int last=x%10;
            x=x/10;
            int r=0;
            r=r*10+last;
            System.out.print(r);
        }
    }

    public static void main(String[] args) {
        reverse(12345678);
    }
}
