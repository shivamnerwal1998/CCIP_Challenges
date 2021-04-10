import java.io.*;
import java.util.*;

import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();
        String str2 = str.substring(0,1);
        str2 = str2.toUpperCase();
        str = str.substring(1,str.length());
        str = str2 + str ; 
        System.out.println(str);
        
        
    }
}
