/*
You are playing an online game. In the game, a list of N numbers is given. The player has to arrange the numbers so that all the odd numbers of the list come after even numbers. Write an algorithm to arrange the given list such that all the odd numbers of the list come after the even numbers.

Input Format

array size and array elements.

Constraints

no

Output Format

modified array.

Sample Input 0

8
10 98 3 33 12 22 21 11
Sample Output 0

10 98 12 22 3 33 21 11
Sample Input 1

5
1 2 3 4 5
Sample Output 1

2 4 1 3 5
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
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
                System.out.print(a[i]+" ");
        }
    }
}
