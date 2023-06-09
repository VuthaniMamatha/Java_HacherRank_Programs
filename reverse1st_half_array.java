/*
Implement a program to sort only first half of the array and keep remaining elements as original.

Input Format

size and array elements

Constraints

no

Output Format

reverse only first half of the array

Sample Input 0

5
4 1 3 5 2
Sample Output 0

1 4 3 5 2
Sample Input 1

6
3 1 2 6 5 4
Sample Output 1

1 2 3 6 5 4
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
        sort(a,n/2);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    public static void sort(int a[],int n){
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            b[i]=a[i];
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            a[i]=b[i];
        }
    }
}
