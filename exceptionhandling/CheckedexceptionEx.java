package exceptionhandling;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class CheckedexceptionEx {


    public static void main(String[] args)
    {



        System.out.println("program execution strarted..");

        try
        {
          FileReader fr = new FileReader("d://src//abstractexample//AbstractEx.java");

          System.out.println((char)fr.read());

           fr.close();
        }
        catch(FileNotFoundException e)
        {

        //    e.printStackTrace();

            System.out.println("There is some issue while opening a file:AbstractEx.java");
        }
        catch(IOException e)
        {
            //e.printStackTrace();
            System.out.println("File opened successfully but there's some issue while reading from a file:AbstractEx.java");
        }

        System.out.println("remaining program executes..");
    }
 
}
//
//
//
//
//
//package exceptionhandling;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
// 
//public class CheckedexceptionEx {
//
//
//    public static void main(String[] args)
//    {
//
//
//
//        System.out.println("program execution strarted..");
//
//        try
//        {
//          FileReader fr = new FileReader("d://src//abstractexample//AbstractEx.java");
//
//          System.out.println((char)fr.read());
//
//           fr.close();
//        }
//        catch(FileNotFoundException e)
//        {
//
//            e.printStackTrace();
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }
//
//        System.out.println("remaining program executes..");
//    }
// 
//}
