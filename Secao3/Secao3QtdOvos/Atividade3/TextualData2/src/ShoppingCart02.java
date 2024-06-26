public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "quer comprar";
        String message = custName + " " + itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preco = 30.99;
        double imposto = 0.18;
        int quantidade = 3;
        
        // Declare and assign a calculated totalPrice
        double precoTotal = (quantidade * preco) + (imposto * quantidade); 
        
        
        // Modify message to include quantity 
        
        System.out.println(message + " " + quantidade + " " + "Camisas");
            
        
        // Print another message with the total cost
        System.out.println("O custo total com o imposto e:" + " " + "$" + precoTotal); 
    }    
}
