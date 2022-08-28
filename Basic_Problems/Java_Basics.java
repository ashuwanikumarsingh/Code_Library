package DSA;
import java.util.Scanner;

public class input_loops_conditions {
  public static void main(String[] args) {
   
//     GETTING USER INPUT

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = sc.nextInt();
    System.out.println(n);
    String s = sc.nextLine();
    System.out.print(s);
    //if we use next in place of nextLine then it will not read after space


//      PRINT STATEMENTS

    int exp = (int)Math.pow(2, 3);
    System.out.println(exp);
    
    System.out.print("\nhii\n");
    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
    System.out.println("*****");
    System.out.println("*\n**\n***\n****\n*****\n");



//     MATH OPERATION AND EXPRESSIONS

    int x=10;
    int y=5;
    int sum=x+y;
    System.out.println("sum : "+sum);

    int mul=x*y;
    System.out.println("Multiply : "+mul);

    int expression = (x*y)/(x+y);
    System.out.println("expression : "+expression);



//     IF ELse Elseif

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int x = sc.nextInt();

    if(x%2==0)
    {
      System.out.println("Even Number");
    }
    else{
      System.out.println("Odd Number");
    }

    int n1=10;
    int n2=30;

    if(n1>n2)
    {
      System.out.println(n1+ " is Greater than "+n2);
    }
    else if(n1==n2){
      System.out.println(n1+" and "+n2+" are Equal");
    }
    else{
      System.out.println(n2+ " is Greater than "+n1);
    }


//     Garding system using if else\

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int marks = sc.nextInt();

    if(marks>90){
      System.out.println("Excellent");
    }
    else if(marks>80){
      System.out.println("Good");
    }
    else if(marks>70){
      System.out.println("Fair");
    }

    else if(marks>60){
      System.out.println("Meets Expectation");
    }

    else{
      System.out.println("Below Par");
    }

    int a=10;
    while(a>0){
      System.out.println(a);
      a-=1;

    }
    int x=10;
     while(x<20){  
      System.out.println(x);
      x+=1;

    }

    for(int x = 10; x<20; x++){
      System.out.println(x);
    }

    
//     TAKING USER INPUT

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int x = 10; x<a; x*=2){
       System.out.println(x);
     }
    
    String name = sc.next();
    System.out.println("Hello "+name);

//     TAKING INTEGER AND STRING AT THE SAME TIME TO AVOID BUG WE NEED TO PARSE INTO INTEGER

    
    Scanner sc = new Scanner(System.in);
    
    int a = Integer.parseInt(sc.nextLine());  // we are using parseInt since we are using nextLine
    String name = sc.nextLine();
    System.out.println("Hello "+name+" Here is the counting");
    for(int x = 10; x<a; x++){
       System.out.println(x);
     }
    
    
   

  }
}
