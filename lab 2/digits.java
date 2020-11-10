package javalab;        ///problem 5
import java.util.Scanner;
public class digits {
   public static void main(String[] args) {
System.out.println("Please Enter a number.......");
  Scanner input = new Scanner(System.in);  
  int num =input.nextInt();
while (num > 0) {
    System.out.println( num % 10);
    num = num / 10;
    }
  } 
    
}
