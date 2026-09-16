// Concept: Multithreading, Runnable Interface, Thread Creation,
// Thread start(), sleep() and Multiple Thread Execution

class Worker implements Runnable {

    String taskName;
    int loopCount;

    // Constructor
    Worker(String taskName, int loopCount) {
        this.taskName = taskName;
        this.loopCount = loopCount;
    }

    @Override
    public void run() {

        // Execute the task for the given number of times
        for (int i = 1; i <= loopCount; i++) {

            System.out.println(
                    taskName + " - step " + i
            );

            try {
                // Pause for 200 milliseconds
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(
                        taskName + " interrupted."
                );
            }
        }
    }
}

public class ThreeWorkers {

    public static void main(String[] args) {

        // Creating three Worker objects
        Worker worker1 =
                new Worker("Downloading", 5);

        Worker worker2 =
                new Worker("Processing", 4);

        Worker worker3 =
                new Worker("Uploading", 3);

        // Creating three Thread objects
        Thread thread1 =
                new Thread(worker1);

        Thread thread2 =
                new Thread(worker2);

        Thread thread3 =
                new Thread(worker3);

        // Starting all three threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}