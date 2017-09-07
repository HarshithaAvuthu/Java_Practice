import java.io.*;

public class MyException{
   public static void main(String[] args)  {
      try{
      int a = 10;
      int b = 0;
      int c = 30;
      System.out.println(a/b);
      System.out.println("Start");
   }
   catch (ArithmeticException e) {
      System.out.println("handle 1");
   }
   catch (Exception e) {
         System.out.println("Handle 2");
   }
   System.out.println("Done");

   }
}