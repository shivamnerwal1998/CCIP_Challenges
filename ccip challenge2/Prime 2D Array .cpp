/*

Given a square matrix, calculate the sum of its diagonals if it is prime.

For example, the square matrix arr is shown below:

1 2 3

4 5 6

9 8 9

The left-to-right diagonal = 0+5+0=5 . The right to left diagonal = 0+5+3=8. Their absolute sum is 13.

Function description

diagonal Sum takes the following parameter:

int arr[n][m]: an array of integers Return

int: the sum

NOTE => Please DONT consider sign for PRIME No. Check.

Input Format

The first line contains a single integer, n , the number of rows and columns in the square matrix arr. Each of the next n lines describes a row, arr[i] , and consists of n space-separated integers arr[i][j].

Constraints

0

Output Format

Return the sum of the matrix's two diagonals as a single integer, if it is prime no only.

Sample Input 0

3
11 2 4
4 5 6
10 8 -12
Sample Output 0

21

                */
#include <iostream>
using namespace std;

bool isPrime(int num){

    if( num < 0  ) num = -num ; // As condition given in code
    if( num < 2  )
        return false ;
    else if( num == 2 || num == 3   )
        return true ;
    for( int i = 2 ; i <=  num/2 ; i++ )
    {
        if( num %i == 0  )
            return false  ;
    }
    return true ;
}
int main() {
    int num  ;
    int sum = 0 ;
    scanf("%d" , &num) ;
    int arr[num][num] ;
    for( int i = 0 ; i < num ; i++ ){
        for(int j = 0  ; j<num ; j++){
            scanf("%d",&arr[i][j]) ;

        if( (i == j && isPrime(arr[i][j]))  )
        {
            sum += arr[i][j] ;
        }
        if( ((i == (num - j - 1)) && isPrime(arr[i][j])) )
        {
            sum += arr[i][j] ;
        }
        }
    }
    printf("%d" , sum) ;
}

