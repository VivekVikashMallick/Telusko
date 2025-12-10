//  class A implements Runnable
//  {
//     @Override
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Thread A: "+i);
//             try {
//                 Thread.sleep(50); // Pause for 500 milliseconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
    
//  }
//  class B implements Runnable
//  {
//     @Override
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Thread B: "+i);
//             try {
//                 Thread.sleep(50); // Pause for 500 milliseconds
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//         }
//     }
    
//  }

public class RunThread
 {   
    public static void main(String[] args) 
    {

        //Runnable r1 = new A();
        //Now we  are removing the class A and directly creating the object of the Runnable interface with the help of the lambda expression , before that we are using annonymous inner class to create the object of the Runnable interface.  
       
    @SuppressWarnings({"ThreadSleep", "Convert2Lambda"})
    Runnable r1 = new Runnable(){
        @Override
        @SuppressWarnings({"CallToPrintStackTrace"})
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Thread A: "+i);
                try {
                    //noinspection BusyWait
                    Thread.sleep(50); // Pause for 50 milliseconds
                    // 1) or we can use Object.wait(50);
                    //synchronized(this){
                    //   this.wait(50);
                    //}
                    // 2) or we can use TimeUnit.MILLISECONDS.sleep(50);
                    //ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
                    // ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
// scheduler.schedule(() -> {
//     System.out.println("Delayed task");
// }, 50, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
         // Now with the help of lambda expression we can create the object of the Runnable interface.
        // Runnable r1 = () -> {
        //     for(int i=1;i<=5;i++)
        //     {
        //         System.out.println("Thread A: "+i);
        //         try {
        //             Thread.sleep(50); // Pause for 500 milliseconds
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        @SuppressWarnings({"CallToPrintStackTrace", "Convert2Lambda"})
        Runnable r2 = new Runnable() {
        @Override
        @SuppressWarnings({"CallToPrintStackTrace"      })

        public void run() {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Thread B: "+i);
                try {
                    //noinspection BusyWait
                    Thread.sleep(50); // Pause for 50 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    } ;

        // so now we have reduced the code by using the lambda expression.

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        System.out.println("Runnable Thread Example");
    }
    
}
