
      import java.awt.*;

 // Button
  //    used to create an  labeled button

    //  constructor
  //             public     Button  (  );
    //                          will create an button with  empty label

    //          public  Button ( String  str )
//                           will create  a Button  object with specified text

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

             class Demo5
                  {
                         public  static void main  ( String  args[] )
                                 {
                                         Frame   f   =  new  Frame("login");

                                         Label   lbl   = new  Label( " Enter  user Name ");
                                         TextField  tf    = new TextField ( 20  );
                                         Button     btn    = new Button("ok");

                                           f.setLayout ( new FlowLayout() );

                                                  lbl.setFont( new Font( "courier" , Font.BOLD ,  20 )  );
                                                  lbl.setForeground ( Color.GREEN);
                                               //   lbl.setBackground( Color.RED );
                                  

                                                  tf.setFont( new Font( "courier" , Font.BOLD ,  20 )  );
                                                  tf.setForeground ( Color.YELLOW );
                                                  tf.setBackground( Color.RED );

                                                  btn.setFont( new Font( "courier" , Font.BOLD ,  20 )  );
                                                  btn.setForeground ( Color.YELLOW );
                                                  btn.setBackground( Color.RED );
                                                  btn.addActionListener (  new  MyListener() );
                                                  f.add( lbl );
                                                  f.add( tf ); 
                                                 f.add( btn  );
                                                  f.setSize(300,300);         f.setVisible(true) ;   
                                  }
                      }              
              class   MyListener   implements    java.awt.event.ActionListener
                         {
                              public void  actionPerformed ( java.awt.event.ActionEvent e  )
                                   {
                                        System.out.println(" btn get clicked" );
                                   }
                         }                                


