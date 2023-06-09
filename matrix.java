/*
Program to read matrix elements of order n x m and display on the console.

Input Format

A matrix of order n x m.

Constraints

no

Output Format

Print the same matrix

Sample Input 0

2
2
1 2
3 4
Sample Output 0

1 2
3 4
Sample Input 1

3
3
1 2 3
4 5 6
7 8 9
Sample Output 1

1 2 3
4 5 6
7 8 9
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
