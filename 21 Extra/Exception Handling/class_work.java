
//   now we know 
//  try  catch     finally 


activity 1 :

  commonly used methods of  Throwable class        
                        toString()
         .. used to represent exception class object in string form
                    public String toString();
          .. note toString() is the overrriden method  
          .. origianally  it comes from   Object

          getMessage()
                used to obtain message attached with a exception class object
                public String getMessage();

           printStackTrace()
            used to obtain stack  based information of incurred exception
            i.e  line number  name of method from where exception get generated
                 name of java file    ..  name of  exception classs  and  string
               detail message.
                                         public void printStackTrace();

            fillInStackTrace()
                  .. this method is implicitly used by throwable class  
               .. while creating Exception class object..... to fill up all
              details abt the concerned  error/exception

           Throwable class include a special  String instance variable
           private String  detailMessage;
           which is used to hold   String value which is forwarded to the
          exception class object via   String argumented constructor.

// activity 2  nested try catch
    class DemoEx3
          {
           public static void main(String args[])
            { 
               int r=0;
               System.out.println(" with in main...");
               try
                   {
                  System.out.println(" with in outer try");
                      try
                         {
                           System.out.println(" inner try  " ); 
                           r=5/0;
                            System.out.println(" res  of div ");
                         } /*catch(ArithmeticException e)
                              { 
                                System.out.println("handling  div error  in inner try ");
                              }*/
                           finally
                             {    System.out.println(" with in finally....of inner try...");
                             }
                  System.out.println(" back in outer try...");
               } /*catch(ArithmeticException e)
                     {   System.out.println(" catching div error in outer try..catch..."); } */
                  finally
                   {
                    System.out.println(" with in outer finally....");
                   }
               System.out.println( " Exiting from main...");     
          }
     }
//       in case when there is some exeception in inner try    and if   inner try is capable of
//       handling same exception  using his own  catch   then  program will resume  from the
//       instruction which if present just after inner try ..  catch  construct
//       i.e  program will resume its working in outer try


//       is  case when  there is a exception in inner try and if  inner try is not capable of
//       handling same exception then  jvm  pass on same  exception to  enclosing try  catch construct
//       ( Note :  if  there is finally with  inner  try  catch ..  jvm will execute it before pass operation )


//          if  outer catch handle the same exception ( which it get from inner try catch )
 //          then program resume after outer try.. catch
//          other wise program get terminated abnormally.
  //              note :  finally also get executed   ( if any )  present with  outer try catch..


// nested try
    class DemoEx4
          {
           public static void main(String args[])
            {
             System.out.println(" with in main...");
             try
                 {
                  System.out.println(" with in outer try");
                      try
                         {
                           System.out.println(" inner try  " ); 
                           int r=5/0;
                           System.out.println(" r = " + r);
                         }
                       /*     catch(ArithmeticException ee)
                              { 
       System.out.println(" catching div error in inner try catch block");
                              }*/
                           finally
                             {
                   System.out.println(" with in inner finally....");
                             }
                  System.out.println(" back in outer try...");
               } catch(ArithmeticException ee)
                       {
                           System.out.println(" catching div error in outer try");
                       }
                   finally
                   {
                    System.out.println(" with in outer finally....");
                   }
               System.out.println( " Exiting from main...");     
          }
     }

=========================================================================================
//  common exception handler...
    class DemoEx6
             {
               public static void main(String args[])
                    {
                       try
                           {
                            System.out.println("with in try...");
                              int x=5/2;
                            int marks[]={23,34};
                            marks[4]=90;
                             System.out.println("After division..");
                           }
                          catch(Exception obj)
                                  {
                   System.out.println("common remeady...");
                                  }
                         catch(ArithmeticException e)
                                {
                         System.out.println("Catching div error");
                                }
               
                            finally
                               {
                     System.out.println("with in finally...");
                               }
                    System.out.println("Exiting from main...");
                    }
            }

=====================================================================

 throw   statement 
    using "throw" statement we can raise some exception in java explicitly.
    also used to rethrow exception
    also  used to  raise exception with some custom exception msg
    used to throw  userdefined  exception


  class DemoW
      {
               public static void main(String args[] )
                    {
                        ArithmeticException  obj  = new  ArithmeticException();
                                             throw  obj;
                    }

      }
       
       class  Demo4
          {
           public static void main(String args[] )
                  {
                    System.out.println(" in main..");
                      ArithmeticException e   = new ArithmeticException("div prob");
                                  throw e;


                  }

          }


// activity 4 
 // throws

   it is not the part of   try  catch  construct

   it is applicable only with  class methods.
                                  either with static methods 
                                  or with non static methods
                                  or with class constructor.

            void  aFoo()  throws   ArithmeticException, NumberFormatException
                   {
                     // body of function..
                   }


If a method is capable of causing an exception that it does not handle, 
it must specify this behavior so that callers of the method can guard 
themselves against that exception. 

You do this by  including   a  throws   clause  in  the  method's declaration.

A  throws  clause lists the  types of exceptions that a method might throw. 

This is necessary for all exceptions, except those of type
Error   or  RuntimeException,  or  any  of  their  subclasses

This is the general form of a method declaration that includes a throws clause:

    return type  method-name (parameter-list)       throws exception-list 
                    {
                         // body of method 
                    }


   Here, exception-list is a comma-separated list of the exceptions that a method can throw. 

                     void  aFun ( )   throws    ArithmeticExcpetion ,   NumberFormat 
                            {

                            }
---------------------------------------------------------

activity 5 
all java exception classes are broadly classfied in 2 ctgries.  exception classes
     Unchecked Exception 
             .. are those which  are raised by java runtime and can be  handled by
                jre .. if java programmer do not handle them at his own...
                means java never asks u to handle such error

                java simply  handle them and terminates ur applications.

               ( till now we have studied  unchecked exceptions)


      Checked Exception  .. also known as  unreported exception
             .. are those exception which are  raised by java jre.
                and  java will enforce  u(programmer) to  handle such error or
                declared to be thrown .. so that caller of the method must handle them
                most of the exception which u encounter during compile time 
                are  checked exception  
                 
  class DemoW
      {
               public static void main(String args[] )
                    {
                        ArithmeticException  obj  = new  ArithmeticException();
                                             throw  obj;
                    }

      }

       class  Demo4
          {
           public static void main(String args[] )
                  {
                    System.out.println(" in main..");
                      ArithmeticException e   = new ArithmeticException("div prob");
                                  throw e;
                  }
          }

  class  Alpha
     {
            public static void main(String args[] )
                {
                    try  {
                      System.out.println(" hello world " );
                        Thread.sleep(3000);
                      System.out.println(" exiting from main... " );
                        }  catch( InterruptedException e  )
                              {
                              }

                }

     }
==================================================================================

//activity 6
//   user defined exception
  // java support  2 types of exception classes
   //   built in 
   //  user defined exception

   // i.e in java if require thn we can design our own user defined exception class
   // also known as custom exception classes

   // steps of creating  user defined exception...

  //  create a simple java class and extend it from any  built in exception class of java...


     class MyException   extends   Exception    
        {

        }

     class YourException  extends   RuntimeException
        {


        }

rule 1 
    if we  extends our  exception class   from
             java.lang.Exception  or any of its sub class
             class thn it become checked exception class

rule 2
    if we   extends our  exception class from  java.lang.RuntimeException class
     or  any of its  subclass  thn it become unchecked exception class.



    Note :    jvm do not throw  user defined exception  automtically ..

     ..  if u wants to generate some user defined exception thn we hv to raise it explicitly using  "throw" statement.

  e.g 
          try 
            {
             
                    throw  new  MyException();
             }catch ( MyException e  )
                  {

                  }

     
    ..  to create  userdefined excecption class almost same as any of built in 
        exception class   always include following 2 forms of  constructor with 
        in user defined exception class

        1   default constructor  -- zero param constructor

        2   string  parameterized constructor.

          
   class MyException  extends  Exception
       {
           MyException()
               {
                super();
               }
           MyException ( String  str )      // this constructor is required 
                                      // to use   getMessage()  method  efficiently  
               {
                 super ( std);
               }
       }

   //   why we need  String param construct..  for the same consider  
   //   inheritance.. tree of  some built in exception classes
class  Throwable  extends Object
              {   private  String  detailMessage;
                  Throwable() {     detailsMessage = null}
                  Throwable( String str)
                     {    detailsMessage   = str ;}
                  public String  getMessage()
                       {  return  detailMessage;  }
                  public String  toString()  
                       {
                           return  getClass().getName()   +  detailMessage ;
                       }
                 
              }
class  Exception    extends   Throwable
               {      Exception( )  {  super();  }
                      Exception( String str) 
                             { super( str); }
               }
 
 class  RuntimeException    extends   Exception
               {      RuntimeException( )  {  super();  }
                      RuntimeException( String str) 
                             { super( str); }
               }

      class  ArithmeticException    extends   RuntimeException
               {      ArithmeticException( )  {  super();  }
                      ArithmeticException( String str)       int   res  =  5 / 0;
                             { super( str); }       throw new ArithmeticException("\ by zero")
               }



                    int   x   =  5 / 0;

difference between  user def and built in exception
as we known in case of abnormal situation 
        jvm 
               1 detect exception 
               2 create object of concerned exception class
               3 raise same object as exception .. 
       same will not happen in case of  user defined exception.

       in case of user def. exception
           java application  takes  following steps
               1.  create  object explicitly 
               2. raise  object of  user def. exception explicitly  
                   it is  good  programming  practice to raise user def. exp
                   by  condition
                     
     .. to raise  user defined excepption we can use   "throw" statement.

       using concept of user defined exception we can pass  a common message 
       of  failure abt  among  n number of  inter depdnt module.


 // an e.g of user defined exception class
  import java.util.*;
  // devlpd by x programmer    
    class InvalidSalaryException  extends  Exception
         { 
           public  InvalidSalaryException()
              { 
                super();
              }
          public  InvalidSalaryException(String   s)
              {    
                super(s);
             }
         }
  class PayCalc
       {
        public static int computeSalary(int basic)  throws  InvalidSalaryException
              {                                      
                if ( basic < 7000 )
                  { 
             throw new  InvalidSalaryException( " ur salary " + basic +  " mst be > 7000" );
                  }
                  return (basic+2000); 
              }   
           }
  //  develpd by some other  programmer
     public class TestPay1
        {  public static void main(String args[] )           
              {Scanner   cin =  new Scanner(System.in);
                try {
               System.out.print(  " Enter ur basic pay ");
               int   bpay =   cin.nextInt();  // 4000
               int gross = PayCalc.computeSalary( bpay ) ;                  
                   System.out.println("ur final salary slip...  gross = " + gross);
                    }catch ( InvalidSalaryException e )
                        {
                          System.out.println(" unable to print pay slip " + e.getMessage() );
                            }
                 System.out.println(" Thanks for using application...");
              }
        }




rethrowing exception :

rethrow means raising a single exception more than once    or  try to handle  
same exeception     more than once.
    
using  rethrow we can  forward  cause of   one exception to     diff.  - 2  modules.

using  concept of  rethrow  a  subprogram or  submodule can   
forward correct  cause of  failure to      its parent  module.

using   rethrow  mechanism we can develop  transparency with in     
diff.  software  modules. to   rethrow a given  exception we are 
required to  catch  a given exception at least  once.
  
 to   rethrow  exception  java  do not  provides us any additional  keyword  
 by  using    "throw"  from   a   catch  we can simply       rethrow  an exception 
  //  rethrow   e.g
  class DemoEx15
         {
           public static int  totalSalary(int basic, int  rate)
                     { 
                int total=0;
                  try
                     {      
           System.out.println("with in calculation...");
                     total=0;
                        int hra =  basic *  (basic /rate) /100;
                        int ta=    basic *   (basic/rate) /100;
                       total=basic+hra +ta;
                      }
                       catch(ArithmeticException e)
                          {
                            System.out.println(" unable to compute  salary ");   
                            throws  e;
                          }
                      return(total);
              }
          public static void main(String args[])
                   {    java.util.Scanner  cin   = new java.util.Scanner( System.in );
                         System.out.println("\n In main...");
                      int  gross =0;
                      int bs=0;
                         try
                            {
                               System.out.print("Enter basic salary ");
                               bs   = cin.nextInt();
                              gross= totalSalary( bs , 0);
                             
          System.out.println(" Total Salary =" + gross);

                            }catch(ArithmeticException e)
                                 {
         System.out.println(" unable to print  gross salary ...");
                              //  e.printStackTrace();
                                 }
         System.out.println("\n Exiting from main...");
                   }
     }


// one more e.g of user defined exception...

   class  InSufficientFoodException  extends  Exception
    {
         InSufficientFoodException ()  
             {
               super();
             }
         InSufficientFoodException (String msg)
              {
                 super(msg );
              }
                   
    }
   class  Son
       {
           public static void  partyArrangement( int n_of_pers ) throws InSufficientFoodException
                   {

                     System.out.println(" ..  dng some home wrk for arrangement... ");
       
                         if (   n_of_pers > 400 )
                            {
                            throw  new  InSufficientFoodException("khana kam pad gaya");
                            }

                     System.out.println("  Good Job  ");
                   }

       }
   class  Papa
      {
          public static void main(String args[] )   // throws InSufficientFoodException  
               {   int no_of_persons = Integer.parseInt( args[0]);
                  try  { 

                  Son.partyArrangement(no_of_persons);

                       } catch ( InSufficientFoodException e  )
                              {
                               System.out.println(  e.getMessage() );
                          System.out.println(  " Sorry  .. to all Honrble guests");
                               System.out.println( " wait for some time ..   Zomato service will bring some food for us ");

                              }

 
                }
      }


