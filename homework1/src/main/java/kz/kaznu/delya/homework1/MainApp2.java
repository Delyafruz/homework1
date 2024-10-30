package kz.kaznu.delya.homework1;

public class MainApp2 {
    public static void main(String[] args) {
        checkSign(4, 6, -2);

    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
}
