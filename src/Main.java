public class Main {
    public static void main(String[] args) {
        int ticketPrice = 100;
        int bonusOnOneMile = 20;

        int bonusMiles = ticketPrice / bonusOnOneMile;

        System.out.println("Начисленны бонусные мили " + bonusMiles);
    }
}
