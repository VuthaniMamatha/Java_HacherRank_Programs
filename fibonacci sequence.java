/*
Implement a program to generate fibonacci sequence upto given number

Input Format

an integer value

Constraints

no

Output Format

fib seq upto n

Sample Input 0

9
Sample Output 0

0 1 1 2 3 5 8 13 21
Sample Input 1

3
Sample Output 1

0 1 1
Sample Input 2

2
Sample Output 2

0 1
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }  
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
