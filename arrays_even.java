/*
Create a function that takes an array of numbers and returns only the even values.

Note:

Return all even numbers in the order they were given.
All test cases contain valid numbers ranging from 1 to 3000.

Input Format

size and an array

Constraints

no

Output Format

remove all odd numbers and print

Sample Input 0

5
1 2 3 4 5
Sample Output 0

2 4
Sample Input 1

6
1 2 3 4 5 6
Sample Output 1

2 4 6
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
            if(a[i]%2==0)
                System.out.print(a[i]+" ");
        }
    }
}
