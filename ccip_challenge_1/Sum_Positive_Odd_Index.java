import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in) ;
        int num  ; 
        int sum = 0 ; 
        num = scan.nextInt(); 
        int []arr = new int[num] ; 
        for(int i = 0 ; i< arr.length ; i ++ )
            arr[i] = scan.nextInt();
        for(int i = 0 ; i<arr.length ; i = i + 2 )
        {
            if( arr[i] >= 0  )
                sum = sum+arr[i] ; 
            else
                continue ; 
        }
        System.out.println(sum) ;
        
    }
}