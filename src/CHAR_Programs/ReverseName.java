package CHAR_Programs;
import java.util.Scanner;

/**
 * Created by manbir on 3/16/2017.
 */
public class ReverseName {

    public static void main(String args[]) {
        String name;
        System.out.println("Enter your name");
        Scanner sc=new Scanner(System.in);
        name = sc.nextLine();
        char rev[]= name.toCharArray();   //tocharArray is a method of scanner class used to convert string into character array.

        System.out.println("reverse name is: ");
        for(int i=rev.length-1;i>=0;i--)
        {
            System.out.print(rev[i]);

        }
        System.out.println("");

    }
}
