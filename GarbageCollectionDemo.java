// Concept: Garbage Collection, System.gc(), Object Lifecycle,
// User Input and finalize()

import java.util.Scanner;

class GarbageDemo {

    // Called when an object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        GarbageDemo[] objects = new GarbageDemo[n];

        // Creating objects
        for (int i = 0; i < n; i++) {
            objects[i] = new GarbageDemo();
        }

        System.out.println("Objects Created");

        // Making objects eligible for garbage collection
        objects = null;

        System.out.println("Objects are now eligible for garbage collection.");

        // Request garbage collection
        System.gc();

        System.out.println("Garbage Collection Requested");

        sc.close();
    }
}