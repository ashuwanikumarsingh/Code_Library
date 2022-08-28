// Question Link: 
// https://nados.io/question/is-a-number...

// Question Statement: 
// 1. You've to check whether a given number is prime or not.
// 2. Take a number "t" as input representing count of input numbers to be tested.
// 3. Take a number "n" as input "t" number of times.
// 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.

import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the Number of Test Cases : ");
    int t = sc.nextInt();

    for (int i =0;i<t;i++){
      int n = sc.nextInt();
      int counter=0;
      for(int div=1;div<=n;div++){
        if(n%div==0){
          counter++;
        }
      }

      if(counter==2){
        System.out.println("Prime Number");
      }
      else{
        System.out.println("Not Prime Number");
      }
    }
  }
}

