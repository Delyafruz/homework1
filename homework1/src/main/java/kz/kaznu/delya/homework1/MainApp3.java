package kz.kaznu.delya.homework1;

public class MainApp3 {
    public static void main(String[] args) {
        selectColor();
    }

    public static void selectColor() {
        int data = 10;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }

    }
}
