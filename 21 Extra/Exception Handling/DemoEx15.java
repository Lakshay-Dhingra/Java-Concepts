
   class  InvalidRateException  extends  Exception
          {
              InvalidRateException() { super(); }
              InvalidRateException(String str ) { super(str); }
          }

  class DemoEx15
         {
           public static int  totalSalary(int basic, int  rate) throws InvalidRateException
                     { 
                  int total=-1;
                  try
                     {      
           System.out.println("with in calculation...");
                         if ( rate  <= 0 )
                             {
   throw new InvalidRateException( "value of given rate " + rate + " mst be >  0 " );
                             }
                        int hra =  basic *  (basic /rate) /100;
                        int ta=    basic *   (basic/rate) /100;
                       total=basic+hra +ta;
                      }
     
                       catch(InvalidRateException  e)
                          {
                            System.out.println(" unable to compute  salary ");                               //throw  e;
                            System.out.println(  e.getMessage() );
                             throw  e;
                          }
                      return(total);
              }
          public static void main(String args[]) 
                   {    java.util.Scanner  cin   = new java.util.Scanner( System.in );
                         System.out.println("\n In main...");
                      int  gross =0;
                      int bs=0;
                            try {
                               System.out.print("Enter basic salary ");
                               bs   = cin.nextInt();
                               System.out.print("Enter rate for hra and ta  ");
                               int rate   = cin.nextInt();

                              gross= totalSalary( bs , rate);
                                 System.out.println(" Total Salary =" + gross); 
                                 } catch ( InvalidRateException e )
                                      {
                                    System.out.println( " unable to print gross");
                                // e.printStackTrace();
                                      }

         System.out.println("\n Exiting from main...");
                   }
     }

