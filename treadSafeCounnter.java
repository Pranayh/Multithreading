import java.util.concurrent.atomic.AtomicInteger;

public class treadSafeCounnter {
    static private int count=0;



    public static void main(String[] args) throws Exception {
       AtomicInteger counter= new AtomicInteger(0);
       Runnable increase= new Runnable() {

           @Override
           public void run() {
               for(int i=0;i<10000;i++){
                   counter.incrementAndGet();
               }
           }
       };

        Runnable decrease= new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                    counter.decrementAndGet();
                }
            }
        };

        Thread t1= new Thread(increase);
        Thread t2 = new Thread(decrease);
        t1.start();
        t2.start();


        t1.join();
        t2.join();
        System.out.println("Final Count Value is: "+count);


        System.out.println("Final Count Value is: "+count);


        System.out.println("hello world");

        System.out.println("git changes");

    }

    
}


