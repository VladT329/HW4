public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        System.out.println("Задание 2");
        clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчнную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();

        System.out.println("Задание 3");
        int year = 1584;
        int userYear = 1984;
        int difference = userYear - year;
        if (difference % 4 == 0) {
            if (difference % 100 == 0 && difference % 400 == 0) {
                System.out.println("Високосный");
            } else if (difference % 100 != 0) {
                System.out.println("Високосный");
            }
        } else {
            System.out.println("Не является високосным");
        }
    }
}