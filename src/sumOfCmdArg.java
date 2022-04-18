/*
*   To find the sum of command-line arguments and count the invalid integers entered.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class sumOfCmdArg
{
    public static void main(String[] args)
    {
        int i, sum=0, num,c=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Number of Numbers to be Calculated: ");
        int n = sc.nextInt();
        for(i=0;i<n;i++) {

            System.out.print("Enter the number: ");
            try
            {

                    num = sc.nextInt(); //reads integer from the user
                    sum = sum + num;
           }
            catch (Exception e)
            {
                c++;
            }
        }
        System.out.println("The sum of the numbers is: "+sum);
        System.out.println("The Count of non-integer value is: "+c);

    }
}
