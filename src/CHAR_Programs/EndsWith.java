package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/23/2017.
 */
public class EndsWith {

    public static void main(String args[]) {
        String name, name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter name2");

        name2 = sc.nextLine();
        if (name.endsWith(name2))          //checks suffix

        {
            System.out.println("name 1 ends with name2");

        }
        else{
            System.out.println("names are different");
        }

    }
}
