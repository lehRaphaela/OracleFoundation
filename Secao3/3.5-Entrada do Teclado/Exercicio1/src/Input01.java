
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String inputString = JOptionPane.showInputDialog("Digite sua idade:");
        
        
        //Parse the input as an int.
        //Print its value +1
        int input = Integer.parseInt(inputString);
        //input++;
        System.out.println(input);
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        String input2 = JOptionPane.showInputDialog("Digite seu nome:");
        System.out.println(input2);

        
    }
}
