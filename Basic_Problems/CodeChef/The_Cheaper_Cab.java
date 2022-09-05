
// Problem
// Chef has to travel to another place. For this, he can avail any one of two cab services.

// The first cab service charges XX rupees.
// The second cab service charges YY rupees.
// Chef wants to spend the minimum amount of money. Which cab service should Chef take?

// Input Format
// The first line will contain TT - the number of test cases. Then the test cases follow.
// The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
// Output Format
// For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.

// You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).

// Constraints
// 1 \leq T \leq 1001≤T≤100
// 1 \leq X, Y \leq 1001≤X,Y≤100
// Sample 1:
// Input
// Output
// 3
// 30 65
// 42 42
// 90 50
// FIRST
// ANY
// SECOND
// Explanation:
// Test case 11: The first cab service is cheaper than the second cab service.

// Test case 22: Both the cab services have the same price.

// Test case 33: The second cab service is cheaper than the first cab service.





/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t<1||t>100)
		{
		    System.exit(0);
		}
		else
		{
		for(int i=0;i<t;i++)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x<1||y<1||x>100||y>100)
		    {
		        System.exit(0);
		    }
		    else
		    {
		        if(x<y)
		        {
		            System.out.println("FIRST");
		        }
		        else if(y<x)
		        {
		            System.out.println("SECOND");
		        }
		        else
		        {
		            System.out.println("ANY");
		        }
		    }
		}
		}
	}
}
