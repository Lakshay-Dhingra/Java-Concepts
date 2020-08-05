
      import java.awt.*;

             class Demo1
                  {
                         public  static void main  ( String  args[] )
                                 {
                                         Frame   f   =  new  Frame("login");
                                        Button   btn    = new Button ( "ok");
                                         TextField  tf    = new TextField( 20 );
                                           f.setLayout ( new FlowLayout() );
                                                    f.add( tf );
                                                     f.add(  btn ) ;
                                         f.setLocation ( 400,400);
                                          f.setSize(300,300);
                                          f.setVisible(true) ;    // to show frame on screen
                                         f.setBackground(  Color.GREEN );
                                        try  { Thread.sleep(2000)  ;  }  catch ( InterruptedException  e  )  {}
                                      //   f.dispose(); 
                                      //     f.setResizable ( false );
                                                 f.pack();
                                                 f.setResizable ( false );
                                  }
                      }                                              


