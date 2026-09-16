// Concept: Multithreading, Thread Class, run(), start(), sleep() and Thread Names

class CountdownThread extends Thread {

    // Constructor to set the thread name
    CountdownThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        // Count down from 5 to 1
        for (int i = 5; i >= 1; i--) {

            System.out.println(
                    getName() + " - Countdown: " + i
            );

            try {
                // Pause for 500 milliseconds
                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println(
                        getName() + " interrupted."
                );
            }
        }
    }
}

public class CountdownDemo {

    public static void main(String[] args) {

        // Creating two countdown threads
        CountdownThread thread1 =
                new CountdownThread("Thread 1");

        CountdownThread thread2 =
                new CountdownThread("Thread 2");

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}