package application;

import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) {
         String nome = JOptionPane.showInputDialog(null,
                "Digite o seu nome:");
     
        String email = JOptionPane.showInputDialog(null,
                "Digite seu email:");
        
        String celular = (String)JOptionPane.showInputDialog(null, 
                "Digite seu número de celular:");
        
        String cep = (String)JOptionPane.showInputDialog(null,
                "Digite seu CEP:");
        
        String endereco = (String)JOptionPane.showInputDialog(null,
                "Digite sua rua:");
        
        String[] acceptableValues = {"Casa", "Apartamento", "Bloco"};
        String tipoEndereco = (String)JOptionPane.showInputDialog(null,
                "Por gentileza qual seu tipo de residência?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        
       int numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o número da sua residência"));
       
        int entrada3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite a quantidade dos produtos a comprar?"));
        
        double entrada4 = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o preço a ser pago:"));
                
        double total = entrada4 * entrada3;
        
        //String totalF = String("%.2f", total);
        
        String resultado = "Confira a baixo suas informações e o total a pagar \n" +           
                "Nome: " + nome + "\n" +    
                "Email: " + email + "\n" +
                "Celular: " + celular + "\n" +
                "CEP: " + cep + "\n" +
                "Endereço: " + endereco + "\n" +
                "Tipo de encereço: " + tipoEndereco + "\n" +
                "Número: " + numero + "\n" +
                "Total da sua compra será: " +total + "\n";                        
        System.out.println(resultado);
        
    }
}
