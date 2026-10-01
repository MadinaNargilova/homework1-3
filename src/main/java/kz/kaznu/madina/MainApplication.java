package kz.kaznu.madina;

public class MainApplication {
    public static void main(String[] args) {
        selectColor();
    }

    public static void selectColor() {
        int data = 7;
        if (data <= 10) {
            System.out.println("Красный");
        }
        else if(data > 10 && data <= 20) {
                System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }

} }
