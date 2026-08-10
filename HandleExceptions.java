import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class HandleExceptions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter employee name");
            String name = sc.nextLine();
            System.out.println("Enter employee ID");
            int id = sc.nextInt();
            System.out.println("Enter employee salary");
            double salary = sc.nextDouble();

            FileWriter writer = new FileWriter("employee.txt");
            writer.write("Employee Details");
            writer.write("Employee Name:" +name);
            writer.write("Employee id:" +id);
            writer.write("Employee salary:" +salary);
            writer.close();
            System.out.println("File details written successfully");
        }
        catch(IOException e)
        {
            System.out.println("File cannot be created (error msg):" +e.getMessage());
        }
        finally
        {
            sc.close();
        }
    }
}