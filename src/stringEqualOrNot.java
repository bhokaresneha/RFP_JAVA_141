/* problem statement ->
 *  Write a program to check two strings are equal or not.
*/
import java.util.Scanner;

public class stringEqualOrNot
{
    public static void main(String[] args)
    {
       // String a = "Sneha";
       // String b = "SNEHA";
       // String b = "SNEHA";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter String1: ");
        String a = scanner.nextLine();
        System.out.println("Please enter String2: ");
        String b = scanner.nextLine();
        if(a.equals(b))
             System.out.println("Strings are equals");
        else
            System.out.println("Strings are not equals");

    }

}
