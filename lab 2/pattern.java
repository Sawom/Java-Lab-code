package javalab;                     ///problem 6
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int row,col,i;
        Scanner input = new Scanner(System.in);
       System.out.println("Enter a number.......  ");
       int n = input.nextInt();
        
       if(n<10){
           for(row=1;row<=n;row++){
           for(col=1;col<=n-row;col++)
               System.out.print(" ");
           for(col=1;col<=row;col++)
               System.out.print(col);
           for(col=row-1;col>=1;col--)
               System.out.print(col);
           System.out.println();
       }
     }
       else{
           for(row=1;row<=9;row++){
           for(col=1;col<=9-row;col++)
               System.out.print(" ");
           for(col=1;col<=row;col++)
               System.out.print(col);
           for(col=row-1;col>=1;col--)
               System.out.print(col);
           System.out.println();
       }
     }     
   }
}
