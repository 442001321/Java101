import java.util.Scanner;
class Degree {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
  int  degree ;
  System.out.println("Enter a number");
    degree = scan.nextInt();
    if(degree >= 90 && degree <= 100){
     System.out.println("A");
    }
    else if(degree >= 80 && degree < 90){
    System.out.println("B");
    }
    else if(degree >= 70 && degree < 80){
    System.out.println("C");
    }
    else if(degree >= 60 && degree < 70){
System.out.println("D");
    }
    else if(degree >= 0 && degree < 60){
    System.out.println("F");
    }
  }
}
