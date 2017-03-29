package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/23/2017.
 */
public class Comparisons {


    public static void main(String args[]) {
        String name, name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter name2");

        name2 = sc.nextLine();
        if (name.equals(name2))         //this is used for comparison and will reply in true or false(default)

        {
            System.out.println("both names are same");

        }
        else{
            System.out.println("names are different");
        }

    }
}
