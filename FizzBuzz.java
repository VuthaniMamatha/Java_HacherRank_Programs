/*
Given a number n, print the result value per line as follows.

=> if n is a multiple of both 3 and 5 print FizzBuzz
=> if n is a multiple of 3 (but not 5), print Fizz
=> if n is a multiple of 5 (but not 3), print Buzz
=> if n is not a multiple of 3 or 5 print the value of n.

implement a program to read number n print the output as described above.

Input Format

a number n

Constraints

no

Output Format

print n string as per the above rules.

Sample Input 0

15
Sample Output 0

FizzBuzz
Sample Input 1

45
Sample Output 1

FizzBuzz
Sample Input 2

12
Sample Output 2

Fizz
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0&&n%5==0)
            System.out.println("FizzBuzz");
        else if(n%3==0&&n%5!=0)
            System.out.println("Fizz");
        else if(n%3!=0&&n%5==0)
            System.out.println("Buzz");
        else
            System.out.println(n);
    }
}
