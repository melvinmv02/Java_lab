import java.util.Scanner;

public class AttendanceCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter classes attended");
        int classattended = sc.nextInt();
        System.out.println("Enter total number of classes");
        int totalclasses = sc.nextInt();
        double percentage = ((double) classattended / totalclasses) * 100;
        System.out.println("The percentage is:" +percentage+ "%");
        sc.close();
    }
}