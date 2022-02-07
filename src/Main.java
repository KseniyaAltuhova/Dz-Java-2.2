public class Main {
    public static void main(String[] args) {
        int account = 400; // текущий счет
        int refill = 5000; // сумма пополнения

        int bonus; // бонус с пополнения
        int amount; // итоговый счет
        if (refill > 1000) {
            bonus = (refill / 100);
            amount = (refill + bonus + account);
        } else {
            bonus = 0;
            amount = (account + refill);
        }

        System.out.println("На Вашем счёте: " + amount + " рублей");
        System.out.println("Получено: " + bonus + " бонусных рублей");
    }
}
