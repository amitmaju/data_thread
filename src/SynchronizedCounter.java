class SynchronizedCounter {
    private int count = 0;

    // Synchronized Method
    public synchronized void increment() {
        count = count + 1;
        System.out.println("Running count is " + count);
    }

    public int getCount() {
        return count;
    }
}
