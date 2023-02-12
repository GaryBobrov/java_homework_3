public class Main {
    public static void main(String[] args) {

        int cash = 400;

        int pay = 1500;

        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int total = cash + pay + bonus;
        System.out.println("Счёт: " + total + " рубля(ей)");
        System.out.println("Бонусных рублей: " + bonus + " рубля(ей)");
    }
}