import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        valores.add(12);
        valores.add(9);
        valores.add(8);
        valores.add(7);
        valores.add(15);
        valores.add(11);
        valores.add(30);              
        
        System.out.println(Calculator2.findTotal(valores));
    }
}
