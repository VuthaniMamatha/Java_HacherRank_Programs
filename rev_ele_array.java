/*
A company trasfers an encrypted code to one of its clients. The code needed to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each consecutive digit and once if the digit got interchanged then it cannot be used again. If at a certain point there is no digits to be interchanged with, then that single digit must be left as it is.
Write an algorithm to decrypt the code so that it can be used to access the required information.

Input Format

a number from the user

Constraints

no

Output Format

an integer value

Sample Input 0

5
1 2 3 4 5
Sample Output 0

2 1 4 3 5
Sample Input 1

6
1 2 3 4 5 6
Sample Output 1

2 1 4 3 6 5
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
            a[i]=sc.nextInt();
        for(int i=0;i<n-1;i+=2){
            int t=a[i];
            a[i]=a[i+1];
            a[i+1]=t;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
