/*
Implement a program to convert the given string into upper case

Input Format

string

Constraints

no

Output Format

string in upper case

Sample Input 0

abc
Sample Output 0

ABC
Sample Input 1

wElCoMe
Sample Output 1

WELCOME
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.toUpperCase());
    }
}
