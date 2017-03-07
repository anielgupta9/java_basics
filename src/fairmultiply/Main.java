package fairmultiply;

/**
 * Created by aniel on 3/7/17.
 */
public class Main {
    public static void main(String[] args) {
        Multiply multiply = new Multiply(8,3);
        //int num3 = multiply.getNum(9,3);
        multiply.display();

        Add add = new Add(4, 3);
       // int num4 = add.getnum(3,8);
        add.display();

        Subtract subtract = new Subtract(8,12);
        //int num5 = subtract.getNum(9,5);
        subtract.display();

        Remainder aniel = new Remainder(9,4);
        //int num6 = aniel.getnum(10 ,3);
        aniel.display();
    }
}