public class ExceptionPropagation
{
    static void divide()
    {
        int a = 10;
        int b = 0;
        int quotient = a/b;
        System.out.println(quotient);
    }
    public static void main(String[] args)
    {
        try
        {
         divide();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by 0" +e.getMessage());
        }
    }
}