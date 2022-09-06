// Problem
// In the current semester, you have taken XX RTP courses, YY Audit courses and ZZ Non-RTP courses.

// The credit distribution for the courses are:

// 44 credits for clearing each RTP course.
// 22 credits for clearing each Audit course.
// No credits for clearing a Non-RTP course.
// Assuming that you cleared all your courses, report the number of credits you obtain this semester.

// Input Format
// The first line contains a single integer TT, the number of test cases. TT test cases follow. Each test case consists of one line, containing 33 integers separated by spaces.

// The first integer is XX, the number of RTP courses.
// The second integer is YY, the number of Audit courses.
// The third integer is ZZ, the number of non-RTP courses.
// Output Format
// The output must consist of TT lines. The i^{th}i 
// th
//   should consist of a single integer: the number of credits one gets for the i^{th}i 
// th
//   test case.

// Constraints
// 1 \le T \le 101≤T≤10
// 1 \le X, Y, Z \le 101≤X,Y,Z≤10
// Sample 1:
// Input
// Output
// 4
// 6 6 5
// 8 7 2
// 9 3 8
// 9 2 4
// 36
// 46
// 42
// 40
// Explanation:


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		
		while(T!=0){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int Z = sc.nextInt();
		    int c1=4;
		    int c2=2;
		    int c3=0;
		
		    int total = ((X*c1)+ (Y*c2) + (Z*c3));
		
		    System.out.println(total);
		    
		    T--;
		}
		
		
		
		
		
	}
}
