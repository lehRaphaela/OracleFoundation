
public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, 5);
        spaceIdx = firstName.indexOf(custName);
        
        System.out.println(firstName);

    }
    
}
