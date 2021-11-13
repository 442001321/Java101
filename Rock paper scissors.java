import java.util.Random;
import java.util.Scanner;
//your grade is 4.5/5

//fix class name and file name with no spaces at all for example :
// Rock paper scissors should be Rockpaperscissors and the file name should be Rockpaperscissors.java
public class Rock paper scissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n (s or S) for scissors\nor Enter any key to exit");
            String Hu =scan.nextLine();
            Hu =(Hu.toLowerCase());
    char Uh = Hu.charAt(0);
        if
            (Uh!='r' && Uh!='p'&&Uh!='s'){
        break;
        }
        char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length ()));
        
        if(Uh == computerChoice){
            System.out.println("is tie: uder choice:" +Uh+"computerChoice"+computerChoice);
        }
      else if((Uh=='r'&&computerChoice=='s')||(Uh=='s'&&computerChoice=='p')||(Uh=='p'&&computerChoice=='r')){
                System.out.println("user wins: computerChoice:"+computerChoice+"Hu choice:"+Hu);
            }
            
            else{
                System.out.println("computer wins computerChoice:"+computerChoice+"Hu choice:"+Uh);
            }
            
            System.out.println("\n\n");
        }while(true);
        
    }
}
