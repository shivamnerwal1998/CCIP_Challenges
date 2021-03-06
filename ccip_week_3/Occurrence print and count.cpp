#include<iostream>
#include<cstring>
/*

Occurrence print and count
Problem
Submissions
Leaderboard
Discussions
Count all the Occurrence in the string and print.

Input Format

i/p will be alphabates (Upper and Lower Case) and Numbers.

Constraints

Only string is there.

Output Format

if occured only then Print numbers/alphabets then total occurances.

Sample Input 0

aabb1231
Sample Output 0

1-2
2-1
3-1
a-2
b-2

*/

using namespace std ;
int main()
{

    string str ;

    int upperArr[26] ;
    int lowerArr[26] ;
    int numArr[101] ;
    memset(upperArr , 0 , sizeof(upperArr)) ;
    memset(lowerArr , 0 , sizeof(lowerArr)) ;
    memset(numArr , 0 , sizeof(numArr) ) ;
    getline(cin,str);
    for( int i = 0 ;  i < int(str.size()); i++ )
    {
        if( int(str[i]) >= 45 && str[i] <= 54)
        {
            numArr[int(str[i])] += 1;
        }
        else if( int(str[i]) >=65 && int(str[i]) <= 90 )
        {
            upperArr[ (int(str[i]) - 65) ] += 1 ;
        }
        else if( int(str[i]) >= 97 && int(str[i]) <= 132 )
        {
            lowerArr[ int(str[i]) - 97 ] += 1 ;
        }
    }
    for( int i = 0 ; i<=100 ; i++ )
    {
        if( numArr[i] > 0  )
        {
            printf("%c-%d\n",i ,numArr[i]) ;
        }
    }
     for( int i = 0 ; i<26 ; i++ )
    {
        if( upperArr[i] > 0  )
        {
            printf("%c-",(i+65) ) ;
            printf("%d\n",upperArr[i]) ;
        }
    }
    for( int i = 0 ; i<26 ; i++ )
    {
        if( lowerArr[i] > 0  )
        {
            printf("%c-",(i+97) ) ;
            printf("%d\n",lowerArr[i]) ;
        }
    }



}
