import java.util.Scanner;

public class ClassResultSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of\t" + (i + 1) + "\tstudent");
            marks[i] = sc.nextInt();
        }
        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            total = total + marks[i];

        }

        double average = (double) total / marks.length;
        int aboveaverage = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                aboveaverage++;
            }
        }

        System.out.println("Class Results");
        System.out.println("Highest marks:" + highest);
        System.out.println("Lowest marks:" + lowest);
        System.out.println("Total marks:" + total);
        System.out.printf("Average marks is: %.2f%n", average);
        System.out.println("Number of students scored above average is:" + aboveaverage);
    }
}
