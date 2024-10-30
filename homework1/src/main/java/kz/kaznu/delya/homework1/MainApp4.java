package kz.kaznu.delya.homework1;

public class MainApp4 {
    public static void main(String[] args) {
        compareNumbers(33, 34);
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
