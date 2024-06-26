import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        //Edit these lines to advance the scanner
        try (Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04.java"))) {
            //Edit these lines to advance the scanner
            System.out.println(sc.nextLine());
            System.out.println(sc.nextLine());
            System.out.println(sc.nextLine());
            
            //Does this line contain "BlueBumper"?
            System.out.println(sc.findInLine("BlueBumper"));
            //Store the next two numbers as xPosition and yPosition
            //Print these positions
            
            int XPos = Integer.parseInt(sc.next());
            int YPos = Integer.parseInt(sc.next());
            
            System.out.println("X: " + XPos + ", Y: " + YPos);
        }
    }    
}
