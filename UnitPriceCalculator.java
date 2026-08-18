import java.util.Scanner;

public class UnitPriceCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of item (in grams):");
        int grams = sc.nextInt();
        System.out.println("Enter price per kilogram:");
        double priceperkg = sc.nextDouble();
        double kilograms = (double) grams / 1000;

        double totalcost = kilograms * priceperkg;
        char category;
        if(totalcost > 500)
        {
            category = 'A';
        }
        else
        {
            category = 'B';
        }
        System.out.println("Final Bill");
        System.out.printf("Weight of an item: %d grams%n ", grams);
        System.out.printf("Price per kilogram: %.2f%n", priceperkg);
        System.out.printf("Total Cost: %.2f%n",totalcost);
        System.out.println("Category is:" +category);
        sc.close();
    }
}