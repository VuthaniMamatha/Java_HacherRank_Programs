/*
Implement a program to insert an element into an array at the first position

Input Format

size,array elements and element to be inserted

Constraints

no

Output Format

return array after insertion

Sample Input 0

5
1 2 3 4 5
8
Sample Output 0

8 1 2 3 4 5
Sample Input 1

4
1 2 3 4
55
Sample Output 1

55 1 2 3 4
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void insertEle(int a[],int c)
        {
            int b[]=new int[a.length+1];
            b[0]=c;
            for(int i=1;i<b.length;i++){
                b[i]=a[i-1];
            }
            for(int i=0;i<b.length;i++){
                System.out.print(b[i]+" ");
            }
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        insertEle(a,c);
    }
}
