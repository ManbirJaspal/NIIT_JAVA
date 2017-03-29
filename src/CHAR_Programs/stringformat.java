package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/16/2017.
 */
public class stringformat {

    public static void main(String args[]) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        String name2= String.format("name is %s",name);
        System.out.println(name2);
        String name3= String.format("name is %f",32.000);
        System.out.println(name3);

    }
}
