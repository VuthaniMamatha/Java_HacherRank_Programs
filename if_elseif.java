/*
Given an integer n, perform the following conditional actions,
If n is odd, print weird,
If n is even and in the inclusive range of 2 to 5, print not weird,
If n is even and in the inclusive range 6 to 20, print weird,
If n is even and greater than 20, print not weird.


Input Format

An integer value from the user.

Constraints

no

Output Format

weird or not weird

Sample Input 0

5
Sample Output 0

weird
Sample Input 1

4
Sample Output 1

not weird
Sample Input 2

6
Sample Output 2

weird
Sample Input 3

7
Sample Output 3

weird
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
            System.out.println("weird");
        else if(n%2==0&&n>=2&&n<=5)
            System.out.println("not weird");
        else if(n%2==0&&n>=6&&n<=20)
            System.out.println("weird");
        else
            System.out.println("not weird");
    }
}
