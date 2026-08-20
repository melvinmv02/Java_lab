import java.util.Scanner;

class ShippingCalculator {

    double calculateCost(double weight) {
        double baseRate = 50;
        return weight * baseRate;
    }

    double calculateCost(double weight, double distance) {
        double baseRate = 50;
        double distanceRate = 5;

        return (weight * baseRate) + (distance * distanceRate);
    }

    double calculateCost(double weight, double distance, boolean isExpress) {
        double baseRate = 50;
        double distanceRate = 5;

        double cost = (weight * baseRate) + (distance * distanceRate);

        if (isExpress) {
            cost = cost * 1.5;
        }

        return cost;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShippingCalculator calculator = new ShippingCalculator();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Is the delivery express? (true/false): ");
        boolean isExpress = sc.nextBoolean();

        double cost1 = calculator.calculateCost(weight);

        double cost2 = calculator.calculateCost(weight, distance);

        double cost3 = calculator.calculateCost(weight, distance, isExpress);

        System.out.println("\n--- Shipping Cost ---");

        System.out.println("Cost based on weight only: Rs. " + cost1);

        System.out.println("Cost based on weight and distance: Rs. " + cost2);

        System.out.println("Cost based on weight, distance and express: Rs. " + cost3);

        sc.close();
    }
}