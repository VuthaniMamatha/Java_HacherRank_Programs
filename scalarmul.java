/*
Implement a program to read a matrix and multiplier and return scalar matrix multiplication.

Input Format

a 3x3 matrix and multiplier

Constraints

no

Output Format

resultent matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
2
Sample Output 0

2 4 6
8 10 12
14 16 18
Sample Input 1

1 1 1
1 1 1
1 1 1
5
Sample Output 1

5 5 5
5 5 5
5 5 5*/
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
        int m=sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=a[i][j]*m;
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
