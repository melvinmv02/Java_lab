import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {

        File file = new File("numbers.txt");

        double sum = 0;
        int count = 0;

        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNext()) {

                try {
                    double num = sc.nextDouble();

                    sum += num;
                    count++;
                }
                catch (InputMismatchException e) {

                    System.out.println("Invalid number: " + sc.next());
                }
            }

            if (count > 0) {
                System.out.println("Average = " + (sum / count));
            }
            else {
                System.out.println("No valid numbers found.");
            }

        }
        catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}