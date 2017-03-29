package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/23/2017.
 */
public class IndexOf {

    public static void main(String args[]) {

        String name, index;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter alphabet to find index no.");
        index = sc.nextLine();
        System.out.println(name.indexOf(index));          // gives the index no. of the character


    }
}
