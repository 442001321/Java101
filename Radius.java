import java.util.Scanner;
public class Radius.java{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter num 1");
     int num = scan.nextInt();
     if(num ==1){
     System.out.println("Radivs");
     float r = scan.nextFloat();
     System.out.println(r*r*3.14);
     }else
     System.out.println("error");
    }
}
