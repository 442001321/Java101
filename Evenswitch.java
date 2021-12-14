import java.util.Scanner;
public class Evenswitch.java{
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num1");
		int h=scan.nextInt();
        switch (h){
        case 1:
            int w;
            System.out.print("Enter a Num2");
        w = scan.nextInt();
        w %=2;
        if (w==0){
        System.out.print("even");
        }
        else {
        System.out.print("odd");
        }
	}
}
}
