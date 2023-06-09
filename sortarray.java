/*
Implement a program to ready array elements and sort the elements in ascending order.

Input Format

size and array elements

Constraints

no

Output Format

sorted array

Sample Input 0

5
1 5 2 3 4
Sample Output 0

1 2 3 4 5
Sample Input 1

6
1 2 3 6 5 4
Sample Output 1

1 2 3 4 5 6
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
            if(a[i]<a[j]){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            } 
            }
        }
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");}
    }
}
