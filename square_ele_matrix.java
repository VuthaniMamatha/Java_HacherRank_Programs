/*
Implement a program to find square of each element present in a matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

resultent matrix

Sample Input 0

1 0 0
0 1 0
0 0 1
Sample Output 0

1 0 0
0 1 0
0 0 1
Sample Input 1

1 1 1
2 2 2
3 3 3
Sample Output 1

1 1 1
4 4 4
9 9 9
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                a[i][j]=a[i][j]*a[i][j];
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
             System.out.println();
        }
    }
}
