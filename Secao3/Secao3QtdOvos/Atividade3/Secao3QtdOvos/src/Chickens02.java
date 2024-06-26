public class Chickens02 {
    public static void main(String[] args) {
        int segunda = 100;
        int terca = 121;
        int quarta = 117;
        double monthlyAverage = 30;
        double monthlyProfit = 0.18;
        
        double dailyAverage = segunda + terca + quarta;
        dailyAverage /= 3;
        
        monthlyAverage *= dailyAverage;
        
        monthlyProfit *= monthlyAverage;
        
        
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
