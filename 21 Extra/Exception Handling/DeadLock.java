/*  complication of   synchronization ...   i.e DeadLock
 //     this  problem  occurs due to  logical  mistake ... of  java application
 //  Definition :
Deadlock : when a thread has locked an object and waiting for another object to be 
released by another thread and the ohter thread is also waiting for the first thread to release
the first object , then both threads will continue waiting for each other forever and it will
results in deadlock.
*/

   class BookTicket implements Runnable
         {     Object train,comp;
               public BookTicket(Object train,Object comp)
                   {   this.train= train;   this.comp=comp;}
               public void run()
                  {  synchronized( train )
                             {    System.out.println(" BookTicket  acquired a lock on train...");
                                   try{   Thread.sleep(6500);  } catch(InterruptedException e) {}
                                   System.out.println(" BookTicket  now waiting for lock on comp..");
                                   synchronized( comp )
                                         { 
                                               System.out.println(" BookTicket  locked the comp...object");
                                         }
                             }
                    }
           }
   class CancelTicket implements Runnable
         {   Object train,comp;
               public CancelTicket(Object train,Object comp)
                   {   this.train= train;   this.comp=comp;}
               public void run()
                  {   synchronized( comp )
                             {    System.out.println(" Cancel Ticket  acquired a lock on comp...");
                                   try{   Thread.sleep(8000);  } catch(InterruptedException e) {}
                                 System.out.println(" CancelTicket  now waiting for lock on train..");
                                synchronized( train )
                                     {    System.out.println(" CancelTicket  locked the train..object.");
                                     }
                          }                             
                    }
           }
      class DeadLock
          {  public static void main(String args[])
                                        {       Object train = new Object();  //2000
                                                 Object compartment = new Object();  //3000
                                                 BookTicket obj1=new BookTicket(train,compartment);
                                                 CancelTicket obj2=new CancelTicket(train,compartment);
                                                 Thread t1=new Thread( obj1);  t1.start();
                                                 Thread t2=new Thread( obj2 );  t2.start();
                                            }
             }
                       
/*
Deadlock : when a thread has locked an object and waiting for another object to be 
released by another thread and the ohter thread is also waiting for the first thread to release

the first object , then both threads will continue waiting for each other forever and it will
results in deadlock.
*/















