import java.io.*;
import java.util.Scanner;

public class FeedbackLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("feedback.txt", true))) {

            while (true) {

                System.out.print("Enter feedback (type exit to stop): ");
                String feedback = sc.nextLine();

                if (feedback.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(feedback);
                writer.newLine();
            }

            System.out.println("Feedback saved successfully.");

        }
        catch (IOException e) {

            System.out.println("Error writing to file: " + e.getMessage());
        }



        try (BufferedReader reader =
                     new BufferedReader(new FileReader("feedback.txt"))) {

            String line;
            int count = 1;

            System.out.println("\nStored Feedback:");

            while ((line = reader.readLine()) != null) {

                System.out.println(count + ". " + line);
                count++;
            }

        }
        catch (IOException e) {

            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}