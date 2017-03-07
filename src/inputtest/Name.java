package inputtest;

import java.util.Scanner;

/**
 * Created by aniel on 3/7/17.
 */
public class Name {
    String name;
    public void getName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
    }

    public void display(){
        System.out.println("Hello "+name);
    }
}
