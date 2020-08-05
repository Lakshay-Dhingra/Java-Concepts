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
          public static void main(String args[] )    throws InSufficientFoodException  
               {  
                  int no_of_persons = Integer.parseInt( args[0]);
        //          try  { 

                  Son.partyArrangement(no_of_persons);

                     //  } catch ( InSufficientFoodException e  )
                       //       {
                         //      System.out.println(  e.getMessage() );
                         // System.out.println(  " Sorry  .. to all Honrble guests");
                          //     System.out.println( " wait for some time ..   Zomato service will bring some food for us ");

      //                        }

 
                }
      }
