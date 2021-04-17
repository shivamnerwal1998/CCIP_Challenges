/*
Given a square matrix, calculate the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3

4 5 6

9 8 9

The left-to-right diagonal = 1+5+9=15 . The right to left diagonal = 9+5+3=17. Their absolute sum is 32.

Function description

diagonal Sum takes the following parameter:

int arr[n][m]: an array of integers Return

int: the sum

Input Format

The first line contains a single integer, n , the number of rows and columns in the square matrix arr. Each of the next n lines describes a row, arr[i] , and consists of n space-separated integers arr[i][j].

Constraints

0

Output Format

Return the sum of the matrix's two diagonals as a single integer.

Sample Input 0

3
11 2 4
4 5 6
10 8 -12
Sample Output 0

23






*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int [][]arr = new int[num][num] ;
        int sum = 0 ; 
        for( int i = 0 ; i < arr.length ; i++  ){
            for( int j = 0 ; j< arr[i].length ; j++  ){
                arr[i][j] = scan.nextInt();
                
                if(i==j)
                    sum += arr[i][j] ; 
                
                
                 if( (j== (num-1-i)) )
                    sum += arr[i][j] ; 
                else continue ; 
                }
        }
        System.out.print( sum ) ; 
        
     
    }
}
