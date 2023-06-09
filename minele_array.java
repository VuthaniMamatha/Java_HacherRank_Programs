/*
Implement a program to find min element present in an array.

Input Format

size and array elements

Constraints

no

Output Format

min element in array

Sample Input 0

5
1 5 2 3 4
Sample Output 0

1
Sample Input 1

6
1 2 3 6 5 4
Sample Output 1

1
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i])
                min=a[i];
        }
        System.out.println(min);
    }
}
