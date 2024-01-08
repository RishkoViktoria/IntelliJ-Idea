public class Main {
    public static void main(String[] args) {

        int ticketCost = 15000; // Стоимость билета

        int milesPerRub = 15; // Количество рублей для одной бонусной мили

        int bonusMiles = ticketCost / milesPerRub;


        System.out.println("За купленный билет начислено " + bonusMiles + " бонусных миль.");





    }
}