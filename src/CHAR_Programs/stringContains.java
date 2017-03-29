package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/16/2017.
 */
public class stringContains {

    public static void main(String args[]) {
        String name, name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter name2");

        name2 = sc.nextLine();
        if (name.contains(name2))

        {
            System.out.println("Search found...");

        }
        else{
            System.out.println("not found..");
        }

    }
}
