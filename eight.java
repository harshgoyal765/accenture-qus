import java.util.*;
public class eight{
  public static void main(String args[]){
    int a=1;
    int b=3;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of c in 1,4,2,3");
    int c= sc.nextInt();
    switch(c){
      case 1: System.out.println(a+b);
      break;
           case 4: System.out.println(a/b);
      break;
           case 2: System.out.println(a-b);
      break;
           case 3: System.out.println(a*b);
      break;
    }
  }
}