
import javax.swing.JOptionPane;


public class NameMaker {
    
    public static void main(String[] args)
    {
     
        String firstName = (String)JOptionPane.showInputDialog(null,
                "Digite o primeiro nome"
        );
        
         String middleName = (String)JOptionPane.showInputDialog(null,
                "Digite o nome do meio"
        );
        
         String lastName = (String)JOptionPane.showInputDialog(null,
                "Digite o segundo nome"
        );
              
        String fullName = firstName + " " + middleName + " " + lastName;
         
         
        System.out.println(fullName);
       
    }

}
