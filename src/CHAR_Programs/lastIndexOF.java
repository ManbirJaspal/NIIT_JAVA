package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/16/2017.
 */
public class lastIndexOF {
    public static void main(String args[]) {

        String name, index;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter alphabet to find index no.");
        index = sc.nextLine();
        System.out.println(name.lastIndexOf(index));   // displays the index of the alphabet used the last time.


    }
}
