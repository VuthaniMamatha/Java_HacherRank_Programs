/*
Implement a program to read an array and reverse the entire array.

Input Format

array size and elements

Constraints

no

Output Format

reversed array

Sample Input 0

5
1 2 3 4 5
Sample Output 0

5 4 3 2 1
Sample Input 1

3 
11 22 33
Sample Output 1

33 22 11
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
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
