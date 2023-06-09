/*
Implement a program to update an element in the given array

Input Format

size,array elements and element to be updated (old element & new element)

Constraints

no

Output Format

return array after updating

Sample Input 0

5
1 2 3 4 5
2
999
Sample Output 0

1 999 3 4 5
Sample Input 1

5
1 2 3 4 5
1
888
Sample Output 1

888 2 3 4 5
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
        int index=sc.nextInt();
        int ele=sc.nextInt();
        update(a,index,ele);
    }
    public static void update(int a[],int index,int ele){
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            if(i==index-1)
                b[i]=ele;
            else 
                b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
