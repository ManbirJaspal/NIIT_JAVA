package CHAR_Programs;

import java.util.Scanner;

/**
 * Created by manbir on 3/23/2017.
 */
public class EqualIgnoreCases {

        public static void main(String args[]) {
            String name, name2;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name");
            name = sc.nextLine();
            System.out.println("enter name2");

            name2 = sc.nextLine();
            if (name.equalsIgnoreCase(name2))

            {
                System.out.println("both names are same");

            } else {
                System.out.println("names are different");
            }

        }
    }

