package javalab;       ///problem 4
import java.util.Scanner;
public class factorial{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){
  System.out.println("Please Enter a number.......");
  Scanner input = new Scanner(System.in);  
  int i;
  int fact=1;  
  int num =input.nextInt();
  fact = factorial(num);   
  System.out.println("Factorial of "+num+" is...... "+fact);    
 }  
}  
