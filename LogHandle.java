class LogHandle {

    String sessionName;

    LogHandle(String sessionName) {
        this.sessionName = sessionName;
        System.out.println("Session started: " + sessionName);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Session cleaned up: " + sessionName);
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            LogHandle handle = new LogHandle("Session-" + i);

            // Make the object eligible for garbage collection
            handle = null;
        }

        // Request the JVM to perform garbage collection
        System.gc();
    }
}