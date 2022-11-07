public class CandyCount {
    public static void main(String[] args) {
        double price = 1.2;
        double money = 12.4;
        int candies = 0;

        if (price > 0 && money > 0) {
            while ((money - price) >= 0) {
                candies++;
                money -= price;
            }
        }
        System.out.println(candies);
    }
}