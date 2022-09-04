// Digits Of A Number
// Easy  Prev   Next
// 1. You've to display the digits of a number.
// 2. Take as input "n", the number for which digits have to be displayed.
// 3. Print the digits of the number line-wise.
// Input Format
// "n" where n is any integer.
// Output Format
// d1
// d2
// d3
// ... digits of the number




import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here
       Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int counter = 0;
    int temp = n;
    while (temp != 0) {
      temp = temp / 10;
      counter++;
    }
    int div = (int)Math.pow(10, counter-1);
    while (div != 0) {
      int q = n / div;
      System.out.println(q);

      n = n % div;
      div = div / 10;
    }
     }
    }
