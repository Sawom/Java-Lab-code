package javalab;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number.......");
        int num1 = input.nextInt();
        if(num1%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
