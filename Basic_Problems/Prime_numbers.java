package DSA;
import java.util.*;


public class prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the Number to check for Prime");
    int num = sc.nextInt();
    boolean value=true;

    for (int i =2;i<num;i++){
      if(num%i==0){
        value=false;
        break;
      }
    }
    if (value==true){

      System.out.println(num+" is Prime Number");
    }
    else{
      System.out.println(num + " is Not a prime number");
    }
  }
}
