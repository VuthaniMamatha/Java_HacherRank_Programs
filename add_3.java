/*
Write a program to accept three space seperated integers and print addition of those three numbers.

Input Format

Three space seperated values

Constraints

no

Output Format

addition of those three integers

Sample Input 0

1 2 3
Sample Output 0

6
Sample Input 1

2 3 4
Sample Output 1

9
Sample Input 2

10 11 12
Sample Output 2

33
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a+b+c);
    }
}
