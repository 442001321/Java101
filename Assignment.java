import java.util.Scanner;
// your grade is 4.5/5
//@ change the class name to match the file name ( Golden rule )
class Main {
 public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    float num1;
    float num2;
    System.out.println("Enter a num");
    num1 = myObj.nextFloat();
    System.out.println("Enter a num");
    num2 = myObj.nextFloat();
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    System.out.println(num1%num2);
    System.out.println(num1>num2);
    System.out.println(num1>=num2);
    System.out.println(num1<num2);
    System.out.println(num1<=num2);
    System.out.println(num1!=num2);
    System.out.println(num1==num2);
   }
 }
