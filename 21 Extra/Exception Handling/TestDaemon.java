/*
  Daemon Thread :
         Daemon Thread is a special kind thread that has following characteristics
    1. It need non daemon threads for its existance, that is if at any point of time during the execution
        of our application if only daemon thread remain as active thread then JRE oppose the
        daemon thread and terminates.

    2. Daemon thread does not compete for resources with non daemon thread that is if 
        it got a chance to execute only if all non daemon thread sunpended.
        

    3. Daemon Threads are used to implements optional services, garbage collection in java is
        executed by the JRE as a Daemon thread.

       each thread has a flag name daemon that is set to make a thread daemon.

       setDaemon()
             method of thread class is used to make a thread daemon.

        public void setDaemon(boolean deamon);
          Thread t=new Thread();  
        t.setDaemon(true);
        t.start();
       Note : Daemon flag must be set before starting the thread.

       isDaemon() : is used to obtain the current value of Daemon  flag.

       public boolean isDaemon();

   Daemon thread generally runs in background // they can be thinked as helper thread
*/

 class  BackgroundMusic  implements  Runnable
        { public void run()
               {
                   int i  =1;   
                while ( true )
                     {    System.out.println(" playing background music...."  +  i++); 
                          try {  Thread.sleep(100);  }  catch ( InterruptedException e )  {}
                     }
               }
        }
                      

       class   Reading  implements  Runnable
             {     private  int   rotation;
                   Reading( int  rotation )
                       {  this.rotation  =  rotation;      }
                   public void run()
                          {     int ctr=1;
                                while ( ctr<=this.rotation )
                                     {     
  System.out.println("  m reading some  text......."  + ctr  +  "   "   +  Thread.currentThread().getName() ); 
                           try {  Thread.sleep(100);  }  catch ( InterruptedException e )  {}
                          ctr++;
                     }
               }
        }
            class  TestDaemon
                {       public static void main( String args[] )  throws  InterruptedException
                            {  Thread    helper   = new Thread( new  BackgroundMusic() );   
                                  helper.setDaemon(true);
                                  helper.start();

              //  Thread  t1   = new Thread ( new  Reading(50) );      t1.setName("rohit");       t1.start();

    //            Thread  t2   = new Thread ( new  Reading(20) );   t2.setName("vipin");         t2.start();

                               //     Thread.sleep(15000);
                           }
                   }


