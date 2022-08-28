// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
// Input Format
// A number t
// A number n
// A number n
// .. t number of times
// Output Format
// prime
// not prime
// not prime
// .. t number of times


// Constraints
// 1 <= t <= 10000
// 2 <= n < 10^9
// Sample Input
// 5
// 13
// 2
// 3
// 4
// 5
// Sample Output
// prime
// prime
// prime
// not prime
// prime




// First solution here we exceeded the time complexy as the program was supposed to cleared by 10 ** 9 time but it exceeded to 10**14 which took more than 1 sec

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for (int i = 0; i < t; i++) {
        System.out.println("A number "+t);
      int n = scn.nextInt();
      int counter = 0;
      for (int div = 1; div <= n; div++) {
        if (n % div == 0) {
          counter++;
        }
      }

      if (counter == 2) {
        System.out.println("prime");
      }
      else {
        System.out.println("not prime");
      }
    }
  
   }
  }
// Main Solution  Using square root methond in order to reduce the time complexty

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for (int i = 0; i < t; i++) {
        int n = scn.nextInt();
        int counter = 0;
        
        for (int div = 2; div*div <= n; div++) {
            if (n % div == 0) {
                counter++;
                break;
            }
        }

        if (counter == 0) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }
  
   }
  }
