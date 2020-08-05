
   import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;

   class  MyScreen extends  JFrame implements  ActionListener
                  {
      //  take   instance variable for  screen  components.
                         private   JLabel   lbl_user;
                         private   JLabel   lbl_pass;
                         private   JTextField  tf_user;
                         private   JPasswordField  tf_pass;
                         private   JButton   btn;

    // initialize these features using  constructor
                        MyScreen()
                               {
                   lbl_user   = new  JLabel("Enter username");
                   lbl_pass   = new  JLabel("Enter pass");
                   tf_user   = new  JTextField(20 );
                   tf_pass   = new  JPasswordField(20);
                
                    btn   = new JButton( "ok");                           btn.addActionListener ( this );
                       super.setLayout(  new FlowLayout() );
               // add  components to  container 
                      add(  lbl_user );  add( tf_user );
                      add(  lbl_pass );  add( tf_pass );
                        add ( btn );
                 setSize(200,200);  setVisible(true);
                  setDefaultCloseOperation ( JFrame.DISPOSE_ON_CLOSE );
                               }

                          public void  actionPerformed ( ActionEvent  e )
                                  {
                                    tf_user.setText( "hello");
                                  }
                  }

  class  DemoWin
       {
             public static void main( String args [] )
                     {
                           new  MyScreen();
                   }
       }
