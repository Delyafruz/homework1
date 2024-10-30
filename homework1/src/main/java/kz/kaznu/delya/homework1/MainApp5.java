package kz.kaznu.delya.homework1;

public class MainApp5 {
    public static void main(String[] args) {
        addOrSubtractAndPrint(6,5, false);
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment ) {
        if (increment = true) {
            System.out.println("result=" + initValue + "+" + delta);
        }
        else {
            System.out.println("result=" + initValue + "-" + delta);
        }
    }
}
