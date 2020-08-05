
      import java.awt.*;

 //  TextArea
  //    used to create  multi  line  text editing region  user can   type  some text with in it during program runtime 

    //  constructor
  //             public      TextArea (  int  row , int col );
    //                          will create textarea with specfied column  and row


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


             class Demo3
                  {
                         public  static void main  ( String  args[] )
                                 {
                                         Frame   f   =  new  Frame("login");

                                         TextArea  tf1    = new TextArea(  10, 30  );

                                           f.setLayout ( new FlowLayout() );
                                  
                                                  tf1.setFont( new Font( "courier" , Font.BOLD |  Font.ITALIC  | Font.CENTER_BASELINE,  20 )  );
                                                  tf1.setForeground ( Color.YELLOW );
                                                  tf1.setBackground( Color.RED );
                                               
                                                    f.add( tf1 );  
                                                    f.setSize(300,300);         f.setVisible(true) ;   


                                                   try   {  Thread.sleep( 6000);   } catch ( InterruptedException e   )   {}
                                                   System.out.println(   tf1.getText() );

                                    
                                  }
                      }                                              


