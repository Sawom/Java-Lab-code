package javalab;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("Please Enter a number.......");
        Scanner input = new Scanner(System.in);
        int i,count=0;
        int num = input.nextInt();
        for(i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }      
    }
}
