/*
Implement a program to clcualte the free number of cups the user gets for a specified number of cups bought by the user. 
The user get 1 cup free for every 6 cups bought.

Input Format

number of cups

Constraints

no

Output Format

total number of coffee cups

Sample Input 0

6
Sample Output 0

7
Sample Input 1

8
Sample Output 1

9
Sample Input 2

10
Sample Output 2

11
Sample Input 3

12
Sample Output 3

14
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+n/6);
    }
}
