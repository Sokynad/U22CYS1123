import java.util.Scanner;

public class Calculator {
  public static void main(String[]args){
    Scanner input=new Scanner (System.in);
    System.out.println("MY CALCULATOR");
    int a;
    int b;
    System.out.println("enter value for a:");
    a=input.nextInt();
    System.out.println("enter value for b:");
    b=input.nextInt();
    int sum = a+b;
    int sub = a-b;
    int div = a/b;
    int multi = a*b;
    System.out.println("your answer are");
    System.out.println(sum);
    System.out.println(sub);
    System.out.println(div);
    System.out.println(multi);
  }
}

        
            
            
        
        
    
