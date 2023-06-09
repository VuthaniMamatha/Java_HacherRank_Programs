/*
Rahul's teacher gave an assignment to all the student that when they show up tomorrow they should find a special type of number and report her. He thought very carefully and came up with an idea to have neon numbers. A neon number is a two digit number where the square of the sum of each digit of the number results in the given number.Given an integer N, Write a programto find whether the number N is a Neon number.

Input Format

an integer number

Constraints

no

Output Format

true or false

Sample Input 0

81
Sample Output 0

true
Sample Input 1

2
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
        int t=n;
        int sum=0;
        if(n>9){
            while(n>0){
                int r=n%10;
                sum=sum+r;
                n=n/10;
            }
        }
        if(sum*sum==t)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
