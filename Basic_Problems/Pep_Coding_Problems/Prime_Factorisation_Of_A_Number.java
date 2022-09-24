// Prime Factorisation Of A Number
// Easy

// 1. You are required to display the prime factorisation of a number.

// 2. Take as input a number n.

// 3. Print all its prime factors from smallest to largest.



// For example:

// for n = 1440, the output should be: 2 2 2 2 2 3 3 5


// Constraints
// 2 <= n < 10 ^ 9


// Format
// Input
// n, an integer


// Output
// p1 p2 p3 p4.. all prime factors of n


// Example
// Sample Input

// 1440

// Sample Output
// 2 2 2 2 2 3 3 5








import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here

  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();  

  for (int div=2; div*div <= n; div++){

    while(n%div==0){
      n = n/div;
      System.out.print(div + " ");
    }

  }
  if(n != 1){
    System.out.print(n);
  }

 }
}
