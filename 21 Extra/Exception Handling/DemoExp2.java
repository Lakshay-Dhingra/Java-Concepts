    class DemoExp2
             { public static void main(String args[])
                      {  System.out.println("1 with in main...");
                         try
                           {  System.out.println("\n2 with in outer try....");
                                 try
                                     {
                                        System.out.println("3 with in inner try...");
                                        int r=5/0;
                                       System.out.println(" main print nahi ho paunga");
                                   }  /* catch(ArithmeticException e)
                                              {
                                                System.out.println(" 4 handling div error. in inner try.");
                                              } */
                                           catch ( NumberFormatException e)
                                               {
                                               System.out.println(" catching div errror..via catch of inner try.");
                                                 }
                                              finally
                                                   { 
                                                     System.out.println(" 4 inner try finally block"); 
                                                    }
                                        System.out.println("  resuming in outer try....");
                              }  catch(ArithmeticException e)
                                     {
                                            System.out.println("  5 handling div error. in outer try.");
                                      }
                             finally 
                                     {
                                        System.out.println(" 6 outer try finally block");
                                      }
                                 System.out.println(" 7 back in main...");  
                             }
                     }


