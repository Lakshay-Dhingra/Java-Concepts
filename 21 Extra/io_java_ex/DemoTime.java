
   import java.io.*;
   import java.util.*;

   class DemoTime
     {  public static void main(String args[] )   throws InterruptedException
             {     
                        long   cur_time   =0; 
                       Date  dobj   ;
                          while ( true )
                          {
                              cur_time   =   System.currentTimeMillis();
                                      dobj  =  new Date( cur_time) ;
                               System.out.print( dobj.toString() );

                               Thread.sleep(1000);
                             System.out.print("\r");    // used to shfit cursor at beg of current line

                         }
             }
        }  

  //  obtaining  current  date and  time   
    //  from  java impl  point of view  data and time  is an object
    //  and   to store date  time value     java  provides us  a   built in class named    java.util.Date
                                        
     //  to  obtain  current  date and time
    //  at first  obtain   time in millisecond   ..  following method of   System class class is used for this purpose
    //              class System
      //                  {
        //                      public static long currentTimeMillis()
        //               }
//Returns the current time in milliseconds. Note that while the unit of time of the return value is a millisecond                                   
 

/*
    // following constructor  of   java.util.Date  class is used to construct current  Date  time object

    public Date(long date)
              Allocates a Date object and initializes it to represent the specified number of milliseconds 
               since the standard base time known as "the epoch", namely January 1, 1970, 00:00:00 GMT.

          Note :     we can obtain  this   base  time  using   System.currentTimeMillis()  method 

*/

   













   