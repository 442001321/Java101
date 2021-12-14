import java.util.Scanner;
public class powFunction.java{
    static float add(float h){
        return h*h;
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float h;
    System.out.println("enter num");
    h=scan.nextFloat();
    System.out.println(add(h));
    }
}
