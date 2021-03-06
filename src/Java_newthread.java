public class Java_newthread extends Thread{


// start method only runs current thread

        public void run () {

            System.out.println("Current thread name  " +  Thread.currentThread().getName());
            System.out.println("run() method called");

        }


        public static void main(String args[]) {
            Java_newthread t = new Java_newthread();
            t.start();

        }
}

