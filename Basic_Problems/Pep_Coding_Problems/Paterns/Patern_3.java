// Pattern 3
// Easy  Prev   Next
// 1. You are given a number n.
// 2. You've to create a pattern of * and separated by tab as shown in output format.
// Input Format
// A number n
// Output Format


// Constraints
// 1 <= n <= 10
// Sample Input
// 5
// Sample Output
// 				*	
// 			*	*	
// 		*	*	*	
// 	*	*	*	*	
// *	*	*	*	*	


// Editorial










import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int sp= n-1;
        int st= 1;
        
        for (int i=1;i<=n;i++){
            
            for (int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            
            for (int k=1;k<=st;k++){
                System.out.print("*\t");
            }
            
            sp--;
            st++;
            System.out.println();
            
        }

    }
}
