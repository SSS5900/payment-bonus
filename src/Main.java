public class Main {
    public static void main(String[] args) {
        double balance = 100;
        int pay = 1558;
        double bonus = 1;
        int bonusVal = 100; // bonus начисляется за каждый bonusVal
        int payLimit = 1000; // граница начисления bonus

        double payBonus;
        double balanceFin;

        if (pay > payLimit) {
            payBonus = Math.floor(pay / bonusVal) * bonus;
            balanceFin = balance + pay + payBonus;

        } else {
            balanceFin = balance + pay;
            payBonus = 0;
        }
        System.out.println("Итоговый счёт: " + balanceFin + " рублей");
        System.out.println("Бонусных рублей: " + payBonus);

    }
}