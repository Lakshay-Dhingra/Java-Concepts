
      import java.awt.*;

 //  TextField 
  //    used to create  single  line  text editing region  user can   type  some text with in it during program runtime 

    //  constructor
  //             public      TextField (  int  no_of_col );
    //                          will create textfield with specfier column width and   text will be blank

//               public      TextField ( String  str    );
 //                                 will  show  passed  string as  default value within  TextField   
               
//               public      TextField ( String  str   , int no_of_Col );

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
//
//                           public  void  setEditable   ( boolean  b )
//                                           we can not  edit   textfield     if we  pass false  value  in  setEditable () method
//                                           but we can  copy the text from  textfield  when  setEditable is   false

//                           public  void  setEnabled (  boolean  b )
//                                           we can not  edit   textfield     if we  pass false  value  in  setEnable ()
//                                          we can not  copy the text from  textfield  when  setEnabled  is   false

//                          public    void setEchoChar ( char ch )
//                                         will  show  a different letter  instead of   ur typed  character.

             class Demo2
                  {
                         public  static void main  ( String  args[] )
                                 {
                                         Frame   f   =  new  Frame("login");

                                         TextField  tf1    = new TextField( 20 );

                                           f.setLayout ( new FlowLayout() );
                                  
                                                  tf1.setFont( new Font( "courier" , Font.BOLD |  Font.ITALIC  | Font.CENTER_BASELINE,  20 )  );
                                                  tf1.setForeground ( Color.YELLOW );
                                                  tf1.setBackground( Color.RED );
    //                                         tf1.setEchoChar ( '*' );
                                               
                                                    f.add( tf1 );  
                                                    f.setSize(300,300);         f.setVisible(true) ;   

                                                   try   {  Thread.sleep( 6000);   } catch ( InterruptedException e   )   {}
                                                  //  tf1.setEditable ( false );
                                                //    tf1.setEnabled ( false );

                                                 System.out.println(   tf1.getText() );
              
                      tf1.setText("MODI");

                                    
                                  }
                      }                                              


