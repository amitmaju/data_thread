public class Java_no_newthread_run extends Thread {

//no start method only runs current thread

    public void run () {

        System.out.println("Current thread name  " +  Thread.currentThread().getName());
        System.out.println("run() method called");

    }


    public static void main(String args[]) {
        Java_no_newthread_run t = new Java_no_newthread_run();
        t.run();

    }
}

