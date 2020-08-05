
   import java.awt.*;
      import javax.swing.*;


             class Demo6
                  {
                         public  static void main  ( String  args[] )
                                 {
                                         JFrame   f   =  new  JFrame("login");

                                         JLabel   lbl   = new  JLabel( " Enter  user Name ");
                                         JTextField  tf    = new JTextField ( 20  );
                                         JButton     btn    = new JButton("ok");

                                           f.setLayout ( new FlowLayout() );
                                  
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


