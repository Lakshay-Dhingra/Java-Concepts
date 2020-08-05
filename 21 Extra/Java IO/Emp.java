import java.io.*;
 import java.util.*;
  public class Emp  implements Serializable    //  if a  java class wants services of serialization 
                                                                                // then same class is  required to implements  Serializable
        {                                                                      //  interface....  Note  Serializable is a marker  interface
                                                                               //  i.e interface with 0 no of methods
            static   Scanner   cin;  
            static  {   cin=new Scanner(System.in);     }   
             String name;
             int age;

          public void getData()
             {
               System.out.print("Enter name");   name=cin.nextLine();
               System.out.print("Enter age");   age=cin.nextInt();
             }
          public void showData()
             {  System.out.println(name + "  "  + age ); }
        }