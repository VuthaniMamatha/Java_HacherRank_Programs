/*
Implement a program to perform multiplication operation on given and next to given number.

Input Format

an integer value

Constraints

no

Output Format

multiplication of current and next number

Sample Input 0

2
Sample Output 0

6
Sample Input 1

0
Sample Output 1

0
Sample Input 2

1
Sample Output 2

2
Sample Input 3

5
Sample Output 3

30
Sample Input 4

3
Sample Output 4

12
Submissions: 76
Max Score: 1
Difficulty: Medium
Rate This Challenge:

    
More

*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n*(n+1));
    }
}
