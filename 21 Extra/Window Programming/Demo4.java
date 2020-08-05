import java.awt.*;

 //  Label
  //    used to describe other component

    //  constructor
  //             public      Label  (  );
    //                          will create an empty label
    //          public  Label ( String  str )
//                           will create  a Label object with specified text  

//  common  methods
//                       public  String  getText();
//                         used to  read  value of  TextField   during  runtime
//                      public  void  setText(  String str ) 
//                              used to change value of textfield programatically 

//                     public  void  setForeground ( Color  cobj )
//                      public void  setBackground( Color  cobj )
//                      public  void   setFont(   Font  fobj )
//                              just like  Color  Font is  built in  class of  awt.
//                                   Font  fobj   = new Font ( "courier" ,  Font.BOLD,   20 );
//                                                                              name          style                    size
//                                                                                      Font.ITALIC
//                                             tf.setFont (   fobj );                                                                                   

             class Demo4
                  {
                         public  static void main  ( String  args[] )
                                 {
                                         Frame   f   =  new  Frame("login");

                                         Label   lbl   = new  Label( " Enter  user Name ");

                                         TextField  tf    = new TextField ( 20  );

                                           f.setLayout ( new FlowLayout() );

                                                  lbl.setFont( new Font( "courier" , Font.BOLD ,  20 )  );
                                                  lbl.setForeground ( Color.GREEN);
                                               //   lbl.setBackground( Color.RED );
                                  

                                                  tf.setFont( new Font( "courier" , Font.BOLD ,  20 )  );
                                                  tf.setForeground ( Color.YELLOW );
                                                  tf.setBackground( Color.RED );
                                                  f.add( lbl );
                                                  f.add( tf ); 
                                                  f.setSize(300,300);         f.setVisible(true) ;   
                                  }
                      }                                              


