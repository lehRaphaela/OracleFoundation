import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random nums = new Random();
        
        int chance = nums.nextInt(3);
        if (chance == 0) {
            System.out.println("Pedra");
        }
        else if (chance == 1) {
            System.out.println("Papel");
        }
         else {
            System.out.println("Tesoura");
        }                  
    }
}
