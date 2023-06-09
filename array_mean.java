/*
Implement a function that takes an array of numbers and returns the mean (average) of all those numbers.

Input Format

an array size and elements

Constraints

no

Output Format

print mean value and round to two decimal places.

Sample Input 0

6
5 3 6 7 5 3
Sample Output 0

4.83
Sample Input 1

5
1 2 3 4 6
Sample Output 1

3.20
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float a[]=new float[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextFloat();
        }
        avg(a);
        
    }
    public static void avg(float a[]){
        double sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=(sum+a[i]);
        }
        System.out.printf("%.2f",(sum/a.length));
    }
}
