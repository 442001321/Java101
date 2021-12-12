import java.util.Scanner;
public class squareWidthAndHeight.java{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter num 1");
     int num = scan.nextInt();
     if(num ==1){
     System.out.println("h");
     float h = scan.nextFloat();
     System.out.println("w");
     float w = scan.nextFloat();
     System.out.println(h*w);
     }else
     System.out.println("error");
    }
}
