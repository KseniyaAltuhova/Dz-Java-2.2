public class Main {
    public static void main(String[] args) {
        int account = 400; // сумма на счете
        int refill = 5000; // сумма пополнения

        int bonus; // бонус с пополнения
        int amount; // итоговая сумма на счете
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
