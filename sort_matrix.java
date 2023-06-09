/*
Implement a program to sort all the elements in asc order in the matrix

Input Format

a matrix

Constraints

no

Output Format

result matrix

Sample Input 0

1 3 2
6 7 9
5 4 8
Sample Output 0

1 2 3
4 5 6
7 8 9
Sample Input 1

1 0 0
0 2 0
0 0 3
Sample Output 1

0 0 0
0 0 0
1 2 3
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
        int b[]=new int[3*3];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[k]=a[i][j];
                k++;
                
            }
        }
        Arrays.sort(b);
        int l=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[l]+" ");
                l++;
            }
            System.out.println();
        }
    }
}
