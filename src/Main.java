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
        else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегчнную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();

        System.out.println("Задание 3");
        int year = 1700;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
        System.out.println("Год " + year + " не является високосным");
            System.out.println();

        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 100){
            if (deliveryDistance < 20){
                System.out.println("Потребуется дней: 1");
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60){
                System.out.println("Потребуется дней: 2");
            }
            if (deliveryDistance >= 60){
                System.out.println("Потребуется дней: 3");
            }
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();

        System.out.println("Задание 5");
        int monthNumber = 5;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону: зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону: весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону: лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону: осень");
                break;
            default:
                System.out.println("Месяца " + monthNumber + " не существует");
        }
    }
}
}