/*
Implement a program to print transpose of a matrix

Input Format

a 3x3 matrix

Constraints

no

Output Format

print transpose of the matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

1 4 7
2 5 8
3 6 9
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

1 0 0
0 2 0
0 0 3
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
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
