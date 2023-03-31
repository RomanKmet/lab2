public class task2 {
    public static void main(String[] args) {
        int t = 752;
        int a = t / 100;
        int b = (t % 100) / 10;
        int c = t % 10;
        if (a >= b && a >= c) {
            System.out.println("Перше число найбільше");
        } else if (b >= a && b >= c) {
            System.out.println("Друге число найбільше");
        } else {
            System.out.println("Третє число найбільше");
        }
    }
}
