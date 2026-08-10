import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        int largest;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        largest = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
        }

        double average = (double) sum / 5;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Largest = " + largest);
    }
}



