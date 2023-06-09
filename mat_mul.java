/*
Write a program to perform multiplication operation on two matrices

Input Format

two 3x3 matrices

Constraints

no

Output Format

resultent matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
1 0 0
0 1 0
0 0 1
Sample Output 0

1 2 3
4 5 6
7 8 9
Sample Input 1

1 0 0 
0 1 0
0 0 1
1 0 0
0 1 0
0 0 1
Sample Output 1

1 0 0
0 1 0
0 0 1
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
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
