import java.util.Scanner;
public class largest.java {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      float x;
      float y;
      float z;
    System.out.println("enter num1");
      x = scan.nextFloat();
    System.out.println("enter num2");
     y = scan.nextInt();
      System.out.println("enter num3");
     z = scan.nextFloat();
     if(x>y && x>z ){
    System.out.println("The largest score is" + x);
    }else if(y>x && y>z ){
    System.out.println("The largest score is  " + y);
    }else if(z>x && z>y ){
    System.out.println("The largest score is"+ z);
        }
    }
}
