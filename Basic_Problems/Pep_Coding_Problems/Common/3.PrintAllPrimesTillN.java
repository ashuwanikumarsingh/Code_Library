// Print All Primes Till N
// Easy  Prev   Next
// 1. You've to print all prime numbers between a range. 
// 2. Take as input "low", the lower limit of range.
// 3. Take as input "high", the higher limit of range.
// 4. For the range print all the primes numbers between low and high (both included).
// Input Format
// low 
// high
// Output Format
// n1
// n2
// .. all primes between low and high (both included)
  
//   Constraints
// 2 <= low < high < 10 ^ 6
// Sample Input
// 6 
// 24
// Sample Output
// 7
// 11
// 13
// 17
// 19
// 23


import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();

    for (int i = low; i <= high; i++) {
      int count = 0;

      for (int div = 2; div * div <= i; div++) {
        if (i % div == 0) {
          count++;
          break;
        }
      }

      if (count == 0) {
        System.out.println(i);
      }
    }
  }
}
