public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int deposit = 1100;
        //     boolean b = amountOfDeposit > 1000;

        int amount;git
        if (deposit <= 1000) {
            amount = 0;
        } else {
            amount = 1;
        }

        int bonus = deposit * amount / 100;
        int finalBalance = balance + deposit + bonus;

        System.out.println("Депозит: " + deposit + " рублей");
        System.out.println("Ваш бонус: " + bonus + " рублей");
        System.out.println("Итоговый счет: " + finalBalance + " рублей");
    }
}