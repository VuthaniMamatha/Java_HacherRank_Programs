/*
Two strings a and b are called anagrams, if they contain all the same characters in the same frequencies.

Input Format

two strings a and b

Constraints

no

Output Format

true or false

Sample Input 0

anagram
margana
Sample Output 0

true
Sample Input 1

python
java
Sample Output 1

false
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        System.out.println(anagrams(str,str1));
    }
   public static boolean anagrams(String s1,String s2){
       char ch1[]=s1.toCharArray();
       char ch2[]=s2.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);
   } 
}
