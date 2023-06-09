/*
Implement a program to reverse each element in the matrix.

Input Format

a 3x3 matrix

Constraints

no

Output Format

result matrix

Sample Input 0

1 2 3
4 5 6
7 8 9
Sample Output 0

1 2 3
4 5 6
7 8 9
Sample Input 1

11 12 13
14 15 16
17 18 19
Sample Output 1

11 21 31
41 51 61
71 81 91
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                int n=a[i][j];
                    while(n>0){
                        b[i][j]=b[i][j]*10+n%10;
                        n=n/10;
                    }
            }
        }
                    
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(b[i][j]+" ");
            }
             System.out.println();
        }
    }
}
