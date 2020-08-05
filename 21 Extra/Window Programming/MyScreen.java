
   import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;

   class  MyScreen extends  JFrame
                  {
 
                      private void  initComponent()
                              {
                   lbl_user   = new  JLabel("Enter username");
                   lbl_pass   = new  JLabel("Enter pass");
                   tf_user   = new  JTextField(20 );
                   tf_pass   = new  JPasswordField(20);
                
                    btn   = new JButton( "ok");                      
                       super.setLayout(  new FlowLayout() );
        
                      add(  lbl_user );  add( tf_user );
                      add(  lbl_pass );  add( tf_pass );
                        add ( btn );
                 setSize(200,200);  
                  setDefaultCloseOperation ( JFrame.DISPOSE_ON_CLOSE );

                              }
   
                        MyScreen()
                               {
                                     initComponent();
                               }

             public static void main( String args [] )
                     {
                           new  MyScreen().setVisible(true);
                     }

                        private   JLabel   lbl_user;
                         private   JLabel   lbl_pass;
                         private   JTextField  tf_user;
                         private   JPasswordField  tf_pass;
                         private   JButton   btn;
                  }

