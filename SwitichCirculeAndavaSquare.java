import java.util.Scanner;
public class SwitichCirculeAndavaSquare.java{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	System.out.println("Enter number 1 or 2");
	   	int num = scan.nextInt();
	    switch (num) {
		case 1:
		System.out.println("Radivs");
	
	float r = scan.nextFloat();
		System.out.println(3.14*r*r);
		break;
		
	    case 2:
		System.out.println("h");
	
		float h = scan.nextFloat();
		System.out.println("w");
	
		float w = scan.nextFloat();
		System.out.println(h * w);
	     break;
	
		    default:
		System.out.println("Error");
		}
    }
}
