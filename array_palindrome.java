/*
Implement a program to check whether an array is paliandrome or not.

Input Format

Array size N and Array Elements

Constraints

no

Output Format

true or false

Sample Input 0

5
1 2 3 2 1
Sample Output 0

true
Sample Input 1

4
10 11 12 13
Sample Output 1

false
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
        System.out.println(pal(a));
        
    }
    public static boolean pal(int a[]){
        int low=0,high=a.length-1;
        boolean result=true;
        while(low<high){
            if(a[low]!=a[high]){
                 result=false;
                 break;
                }
            low++;
            high--;
        }
        return result;
    }
}
