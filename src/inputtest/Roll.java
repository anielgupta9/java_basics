package inputtest;

import java.util.Scanner;

/**
 * Created by aniel on 3/8/17.
 */
public class Roll {
    String name;
    int roll;
    String address;
    public void getname(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter your name:");
        name = sc.nextLine();
        System.out.println("enter your Roll");
        roll = sc.nextInt();

        System.out.println("enter your address:");
        address = sc1.nextLine();
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("address:" + address);
    }
}
