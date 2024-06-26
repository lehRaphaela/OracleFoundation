import java.util.ArrayList;

public class Calculator2 {
    public static double tax = 1.05;
    public static double tip = 0.15;  //Change tax and tip if you prefer different values
    
    public static ArrayList<Integer> findTotal(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (double valor : list) {
            int value = (int) (valor * (tax + tip));
            result.add(value);
        }   
        return result;
    }
}