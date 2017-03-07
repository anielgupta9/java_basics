package swap1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by aniel on 3/4/17.
 */
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}