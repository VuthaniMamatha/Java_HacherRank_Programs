/*
create a method/function that takes a string as its argument and returns the string in reversed order.

Input Format

a string

Constraints

no

Output Format

reversed string

Sample Input 0

Hello Word
Sample Output 0

droW olleH
Sample Input 1

The quick brown fox
Sample Output 1

xof nworb kciuq ehT
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer s=new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
}
