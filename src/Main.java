public class Main {
    public static void main(String[] args) {
        int startBalance = 100; // Начальный баланс клиента
        int addMoney = 1100; // Сумма пополнения

        int bonus;

        if (addMoney > 1000) {
            bonus = addMoney / 100;
        } else {
            bonus = 0;
        }
        int balance = addMoney + startBalance + bonus;
        System.out.println( " Бонус " + bonus + "рублей");
        System.out.println( " На балансе " + balance + "рублей");
    }
}
