/*
Implement a program to read an array elements and print sum of all elements in an array which are ending with 3.

Input Format

size of the array and array elements

Constraints

no

Output Format

sum of all elements ending with 3

Sample Input 0

6
1 2 3 11 12 13
Sample Output 0

16
Sample Input 1

5
11 22 33 44 55 66
Sample Output 1

33
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%10==3)
                sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
