public class Main {
    //String function

    public static void main(String[] args) {
        String s="sumedh";
        String s2="sumedh";
        String s3=new String("sumedh");
        String s4="thisisssmore";
        System.out.println(s==s2);
        System.out.println(s==s3);

        System.out.println(s.equals(s3));
        System.out.println(s.length());
        System.out.println(s.substring(0,3));
        System.out.println(s.compareTo(s4));
    }
}
