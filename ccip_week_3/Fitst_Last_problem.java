/*
First n’ last Problem
Problem
Submissions
Leaderboard
Discussions
Sneha got a task to play with words. He decided to merge the first and last letter of the word together and add a new word with just letters in her dictionary.You have task to print those farthest letters after concatenation.

Ex: Input – Condition Output – Cn

Input Format

Enter a word of length ‘n’.

Constraints

2<= n <= 20

Output Format

Print the output after performing necessary operations.

Sample Input 0

Condition
Sample Output 0

Cn
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String s = scan.next();
        String a = (s.substring(0,1)+s.substring((s.length())-1)) ; 
        System.out.println(a);
    }
}