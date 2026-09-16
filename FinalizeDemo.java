// Concept: finalize(), Garbage Collection, Object Lifecycle and System.gc()

class Demo {

    // finalize() is called before the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called");
    }
}

public class FinalizeDemo {

    public static void main(String[] args) {

        // Creating an object
        Demo obj = new Demo();

        System.out.println("Object Created");

        // Making the object eligible for garbage collection
        obj = null;

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}