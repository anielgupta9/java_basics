package swap;

/**
 * Created by aniel on 3/4/17.
 */
public class NumSwap {
   public static void main(String[]args){
      int a=3;
      int b=7;
        System.out.print("a="+a);
        System.out.println("; b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.print("a="+a);
        System.out.println("; b="+b);
    }
}
