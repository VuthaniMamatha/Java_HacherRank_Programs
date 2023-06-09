/*
In a company, an employee's rating point (ERP) is calculated as the sum of the rating points given by the employee's manager and HR. The employee rating grade (ERG) is calculated according to the ERP ranges given below.

ERP ERG
30-50 D
51-60 C
61-80 B
81-100 A



Write an algorithm to find the ERG character for a given employee's ERP.

Input Format

an integer value

Constraints

no

Output Format

employee rating grade

Sample Input 0

35
Sample Output 0

D
Sample Input 1

55
Sample Output 1

C
Sample Input 2

75
Sample Output 2

B
Sample Input 3

85
Sample Output 3

A
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=30&&n<=50)
            System.out.println("D");
        
        else if(n>=51&&n<=60)
            System.out.println("C");
        else if(n>=61&&n<=80)
            System.out.println("B");
        else
            System.out.println("A");
    }
}
