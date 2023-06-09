/*
Implement a program to find factorial of the given number.

Input Format

an integer value from the user

Constraints

no

Output Format

factorial value

Sample Input 0

5
Sample Output 0

120
Sample Input 1

0
Sample Output 1

1
Sample Input 2

1
Sample Output 2

1
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println(f);
    }
    public static int fact(int n){
        if(n==1||n==0)
            return 1;
        else 
            return n*fact(n-1);
    }
}
