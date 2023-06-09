/*
Create a function/method that takes two Strings and returns true of the first string ends with second string, otherwise return false.

Input Format

a string from the user

Constraints

no

Output Format

true or false

Sample Input 0

abc
bc
Sample Output 0

true
Sample Input 1

abc
d
Sample Output 1

false
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String e=sc.next();
        if(s.endsWith(e))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
