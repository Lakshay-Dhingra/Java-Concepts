  import java.io.*;
   import java.awt.*;
  import  javax.swing.*;
  import  java.awt.event.*;
   class   FileFrame  extends    JFrame  implements  ActionListener 
     { 
            JTextArea   jta ;            JButton  jb ;             JTextField  jtf;     JScrollPane  jp;

            FileFrame()
                      {
                          jta   = new JTextArea( 20,20 );     jta.setFont ( new Font(  "courier" , Font.BOLD , 20 ) );
                           jp   = new  JScrollPane (  jta );

                         jtf    = new  JTextField(20);   jtf.setFont ( new Font(  "courier" , Font.BOLD , 20 ) );
                         jb = new  JButton ( " open ");  jb.setFont ( new Font(  "courier" , Font.BOLD , 20 ) );

                         setLayout ( new BorderLayout() );
                                   add(  jtf ,  BorderLayout.NORTH );
                                   add(  jp ,  BorderLayout.CENTER );
                                   add(  jb ,  BorderLayout.SOUTH );
                                  jb.addActionListener( this );
                      setSize(300,300);  setVisible( true );
                        setDefaultCloseOperation (  JFrame.DISPOSE_ON_CLOSE );
                      }

             public void  actionPerformed( ActionEvent ee  ) 
                         {
                                 try {          

                           //   JFileChooser   jfc   = new  JFileChooser ();
                            //     jfc.showOpenDialog( this );

                                           FileInputStream   fin   = new  FileInputStream (  jtf.getText()     );
                                                    int   ch  ;
                                                    StringBuffer   sb   = new StringBuffer( 2000 );
                                                    while ( true )
                                                     {
                                                          ch =  fin.read();
                                                          if ( ch   == -1 )   { break; }
                                                              sb.append( (char) ch );
                                                       }
                                                      jta.setText ( String.valueOf(  sb ) ); 
                                                 fin.close();
                                        }   catch ( IOException  e )        {  jta.setText(" invalid file name "); }


                       }
              
         public static void main(String args[] )      {       new   FileFrame();    }

     
        }
