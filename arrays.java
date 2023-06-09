/*
Implement a program to read and write array elements.

Input Format

array size and elements

Constraints

no

Output Format

list of array elements

Sample Input 0

5
1 2 3 4 5
Sample Output 0

1 2 3 4 5
Sample Input 1

7
9 1 8 2 7 3 7
Sample Output 1

9 1 8 2 7 3 7
Sample Input 2

3
111 222 333
Sample Output 2

111 222 333
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
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
