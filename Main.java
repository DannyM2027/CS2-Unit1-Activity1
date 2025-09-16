// 1. IMPORT SCANNER CLASS
import java.util.Scanner;
public class Main {

   public static void main(String []args) {
      System.out.println("Welcome to Madlibs");

      // 2. set up a scanner OBject
      Scanner input = new Scanner(System.in);
      // System.in refers to physical keyboard

      // 3. Use the scanner to take input
      System.out.println("Type ur name then press eneter");
      String player = input.nextLine();
      System.out.println("welcome, " + player);














   }
}
