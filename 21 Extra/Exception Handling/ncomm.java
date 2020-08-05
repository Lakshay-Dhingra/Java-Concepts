  // t2... loc   sb ..    sb... wait

//    t3...  loc  sb  ...   sb ... wait                   block...    t2    t3

//   t1... sb... loc...  for...   appending..      t1..  sb.notify()


 
 class ncomm
     {
      public static void main(String args[]) throws Exception
          {
               Producer obj1=new Producer();
               Consumer   obj2=new Consumer(obj1);
               Consumer   obj3=new Consumer(obj1);

                Thread t1=new Thread(obj1);  
                Thread t2=new Thread(obj2); t2.setName("con1");
                Thread t3=new Thread(obj3);  t3.setName( "con2");

         t1.start();      t2.start();  t3.start(); 
          }
     }
class Producer  implements Runnable
        {
            StringBuffer sb;     boolean   status=false;
            Producer()
             {
               sb=new StringBuffer();
             }
           public void run()
              {
                try {  Thread.sleep(1000); }  catch ( InterruptedException e )  {}
                synchronized(sb)
                 {
                   
                    for(int i=1;i<=10;i++)
                       {
                         try
                             {
                               sb.append(i+":");
                               System.out.println("appending");
                              Thread.sleep(1000);
                            }catch(Exception e){}
                       }
                 status=true;
                // sb.notifyAll();
                 sb.notify();
              }
        }
   }
  class Consumer implements Runnable
                 {
                     Producer prod;
                     Consumer(Producer prod)
                        {
                           this.prod=prod;
                        }
                    public void run()
                        {
      System.out.println(  " lets begin "    +    Thread.currentThread().getName()      );
              synchronized(prod.sb)
                 {     
                              try
                               {
                               System.out.println("checkig..." +  Thread.currentThread().getName() );
                                if ( prod.status==false )
                                 {
                               System.out.println(" ME" +  Thread.currentThread().getName()  + " waiting... ");

                              try{ prod.sb.wait(); } catch(Exception e){}
                                  }
                               }catch(Exception e){}
                               System.out.println(" contents of sb = " + prod.sb   +  "  from  "   +  Thread.currentThread().getName() );

                         prod.sb.notify();                         
                  }
                   
                      }
          }






/*
  wait()
   causes a thread to wait until it is notified. 
   This mehtod can only be called from synchronized method
   when  wait () method executes it break the synchronized block so that object lock is removed
     
   Note  : when sleep() is called from the synchronized block at that time object is still under lock

   Generally sleep is used for making a thread to wait for some time
   where as wait() is used in connection to notify and notifyAll

   notifyAll()
          ... unblock the threads that called wait() on this object
          .. can only be called from synchronized block

   notify()
          .. unblocks one randomly selected thread among the threads that called wait on this object
        
*/






