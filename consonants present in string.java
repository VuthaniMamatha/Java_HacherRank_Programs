/*
Implement a program to count number of consonants present in string

Input Format

string

Constraints

no

Output Format

number of consonants

Sample Input 0

hello
Sample Output 0

3
Sample Input 1

welcome
Sample Output 1

4
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='i'&&s.charAt(i)!='o'&&s.charAt(i)!='u')
                count++;
        }
        System.out.println(count);
    }
}
