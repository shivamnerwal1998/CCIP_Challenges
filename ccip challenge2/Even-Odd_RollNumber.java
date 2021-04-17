/*
In a class there can be ’n’ students, whose roll numbers starts from zero ’0’. Two practicals assigned to all the students such that all the students with even roll number will do practical 1 and with odd roll numbers do practical 2.

Marks alloted to each student and store in the form of array. We need to find the absolute difference between the average marks of students with even roll number & odd roll numbers.

Input Format

Accept marks of ‘n’ students.

Constraints

1 <= n <= 50 1 <= marks <= 100

Output Format

Print the absolute value of difference of averages

Sample Input 0

5
25 36 48 29 95
Sample Output 0

23.5

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in) ;
        int num = scan.nextInt() ;
        float []arr = new float[num] ;
            for( int i = 0 ; i< arr.length ; i++)
                arr[i] = scan.nextInt();
        float evenSum = 0 ;
        int evenSt = 0 ;
        int oddSt = 0 ; 
        float oddSum = 0 ;
        for( int i = 0 ; i< arr.length ; i++)
        {
            if( (i+1) % 2 == 0 )
            {
                evenSt++ ;
                evenSum += arr[i]  ;  
            }
            else
            {
                oddSt++ ; 
                oddSum += arr[i] ; 
            
            }
        }
        double evenAvg = (evenSum/evenSt) ; 
        double oddAvg = ( oddSum/oddSt ) ; 
        double value = java.lang.Math.abs( (evenAvg - oddAvg) ) ;
        System.out.printf( "%.1f",value )  ; 
        
        
        
        
    }
}
