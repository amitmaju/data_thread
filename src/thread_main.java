import java.lang.*;


public class thread_main implements Runnable{


        private Thread t;
        private String threadName;
        public static double salary =1000;


        thread_main( String name) {
            threadName = name;
            System.out.println("Creating " +  threadName );
        }



        public void run() {
            System.out.println("Running " + threadName);
            try {
                for (int i = 4; i > 0; i--) {
                    salary = salary+ 1;
                    System.out.println("Thread: " + threadName + ", " + i + " salary = " + salary);
                    if (threadName == "Thread-1") {
                        thread_sub1 thread1 = new thread_sub1();
                        thread1.method_print(); }
                    else {
                        thread_sub2 thread2 = new thread_sub2();
                        thread2.method_print();}

                    // Let the thread sleep for a while.
                    Thread.sleep(5000);
                }
            }
            catch(InterruptedException e){
                System.out.println("Thread " + threadName + " interrupted.");
            }
            System.out.println("Thread " + threadName + " exiting.");

        }

        public void start () {
            System.out.println("Starting " +  threadName );
            if (t == null) {
                t = new Thread (this, threadName);
                t.start ();  // creates a new thread and execute the run() method.
            }
        }



        public static void main(String args[]) {
            thread_main R1 = new thread_main("Thread-1");  // new thread created ad thread_main extends runnable.

            salary = 2000;
            R1.start();


            thread_main R2 = new thread_main("Thread-2");
            salary = 3000;
            R2.start();
        }
}


