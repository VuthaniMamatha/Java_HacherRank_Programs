/*
Implement a program to generate tribanocci sequence upto given number

Input Format

an integer value

Constraints

no

Output Format

trib seq upto n

Sample Input 0

3
Sample Output 0

0 1 2
Sample Input 1

4
Sample Output 1

0 1 2 3
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
        if(n<=2){
            return n;
        }
        return fib(n-1)+fib(n-2)+fib(n-3);
    }
}
