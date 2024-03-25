public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int amountOfDeposit = 1100;
        boolean b = amountOfDeposit > 1000;

        int amount;
        if (b) {
            amount = 1;
        } else {
            amount = 0;
        }

        int bonus = amountOfDeposit * amount / 100;
        int finalAccountBalance = accountBalance + amountOfDeposit + bonus;

        System.out.println("Депозит: " + amountOfDeposit + " рублей");
        System.out.println("Ваш бонус: " + bonus + " рублей");
        System.out.println("Итоговый счет: " + finalAccountBalance + " рублей");
    }
}