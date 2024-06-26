import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Não há entrada aqui, apenas uma mensagem",
                "Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Faça uma escolha",
                2,
                null,
                null,
                "Digite algo aqui.");
        
        
        String[] acceptableValues = {"Esolha 1", "escolha 2", "Escolha 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Esta é uma pergunta?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
