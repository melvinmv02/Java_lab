import java.util.Scanner;


public class DivisionByZero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter 1st number:");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number");
            int b = sc.nextInt();
            int div = a/b;
            System.out.println("Quotient is:" +div);

        }
        catch(ArithmeticException e)
        {
            System.out.println("Error message:" +e.getMessage());
        }
        finally
        {
            System.out.println("Cannot divide by 0");
        }
        sc.close();
    }
}
