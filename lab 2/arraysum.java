package javalab;
import java.util.Scanner;
import java.util.Arrays;
public class arraysum {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter size of the array.......");
       int n = input.nextInt();
       int i;
       double sum = 0;
        System.out.println("Now enter elements......");
       double array [] = new double[n];
       for (i=0;i<array.length;i++){
    	  array[i] = input.nextDouble();
      }
      for (i=0;i<array.length;i++){
          if(array[i]%2==0){
              sum= sum+array[i];
          }
      }
        System.out.println("Sum = "+sum);    
    } 
}
