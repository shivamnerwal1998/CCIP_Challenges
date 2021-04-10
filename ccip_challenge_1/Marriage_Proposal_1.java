import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean flag = false ;
        int num2= 0 ;
        for( int i = 0 ; i <= num-1 ; i++)
        {

            for( int j = 0 ; j <= (num*2)-1 ; j++ ){


                if( i > 0 ) {

                            if (j >= (num - i) ) {
                                for (int z = 1; z <= (2*i)  ; z++) {
                                    System.out.print(" ");
                                    j++ ;
                                    flag=true ;
                                    num2= j ;
                                }
                            }
                            else
                                System.out.print("*");

                        while( num2 <=(num*2-1) && flag ) {
                            System.out.print("*");
                            num2++ ;
                            j++;

                    }

                }
                else System.out.print("*");

            }
                System.out.print("\n");

        }

    }
}
