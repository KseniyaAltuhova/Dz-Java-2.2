public class Main {
    public static void main(String[] args) {
        int account = 300;
        int refill = 2000;

        int bonus;
        int amount;
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
