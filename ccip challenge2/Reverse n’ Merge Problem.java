/*
Ravi got a task to merge two sequences. He got a number as an input and alloted a task to print all the natural number upto ‘n’ in both forward and backward manner. To solve this issue he can use only “Recursion” approach.Recursion is calling function inside the same function.

Input Format

Accept a number ‘n’ as input

Constraints

0 <= n <= 50

Output Format

Print the natural number upto ‘n’ in both forward & backward problem.

Sample Input 0

5
Sample Output 0

1 2 3 4 5 5 4 3 2 1
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void printForward(int num , int countF){
        if( countF > num )
            return ;
        System.out.print( countF ) ; 
        System.out.print(" ") ; 
        printForward(num , ++countF);  
    }
    
    public static void printBackward(int num,int countB){
        if( countB < 1 )
            return ;
        System.out.print(  countB ) ;
         System.out.print(" ") ; 
        printBackward(num , --countB) ; 
    
    
    }
    
    public static void main(String[] args) {
    
        int num ; 
        Scanner scan = new Scanner(System.in) ;
        num = scan.nextInt();
        int countF = 0 ;  
        int countB = num ; 
        
        printForward(num , countF);
        printBackward(num , countB);
        
    }
}
