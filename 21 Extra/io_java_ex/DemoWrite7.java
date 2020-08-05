//  redirection  of  mon buff with some other  stream  buffer.

   import java.io.*;

   class DemoWrite7
     {  public static void main(String args[] ) 
             {      try  {
                    FileOutputStream   fout    = new FileOutputStream ( "d:\\demo_io\\ademo.txt" ,  true );
                           PrintStream   pout     = new  PrintStream (  fout );

                        PrintStream   temp  =  System.out  ;  //  cpy and  store  ref of monitor buffer

                               System.setOut (   pout );      //  System.out  = pout ;
                              for( int  i  =0; i<5;i++)
                                    {
                                     for ( int j  = 0 ;j <=i ;j++)
                                        {
                                System.out.print( "* ");
                                        }
                                     System.out.println();
                                   }

                            System.out.println( "to a file hello");
                            System.out.println( 234);
                            System.out.println( false);
                            System.out.println( 343.43);
                       System.setOut ( temp );
 
                           System.out.println( "back to monitor hello");
                            System.out.println( 234);
                            System.out.println( false);
                            System.out.println( 343.43);
                             } catch (  IOException  e   )     {  e.printStackTrace();   } 

           //            System.out  = null  ;     // invalid  as   out  is  a final  ref. variable 

             //   redirecting    out   ref. variable to some other  stream  buffer
             //        by default  out  is  a  final  ref. variable  defined in   System  class
               //   we can  not  change it s   value  directly  ..   but      using  setOut()  method  of   System
               //  class   we can  do  the  same   indirectly

    //  same thing is available for     "err"   reference variable     .. using    setErr(  ) 

             //   class System
             //            {
             //                     public  static  void  setOut (  PrintStream  pout)  ;  // used to change   out 
             //                     public  static  void  setErr (  PrintStream  pout)  ;    // used to change   err 
             //                     public  static  void  setIn (  InputStream  in)  ;     //  used to  change   in 
             //             }

                    
           }
        }  

   














   