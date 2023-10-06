import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        char counter='A';

        for(int i=1;i<=4;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(counter++);
            }
            System.out.println();
        }
    }
}
