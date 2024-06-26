import java.util.Scanner;

public class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner in = new Scanner(System.in);
        
        //Find and print the sum of three integers entered by the user
        int num1 = in.nextInt();
        in.nextLine();
        String num2 = in.nextLine();
        int num3 = in.nextInt();
        
        System.out.println(num1+num2+num3);
        
        
        //Remember to close the Scanner
        in.close();
         
    }
}
