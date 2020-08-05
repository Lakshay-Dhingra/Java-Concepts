package   tester;
    import   hr.senior.*;
public class    Test
      {
          public static void main(String args  [] )
                {
                    hr.Policy  hobj   = new  hr.Policy() ;
                                     hobj.showPolicy();

                    inv.Policy  iobj   = new  inv.Policy() ;
                                     iobj.showPolicy();

                  SrPolicy  sobj    = new  SrPolicy();
                                    sobj.showSrPolicy();
                }
      }