public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке \n");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке \n");
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке \n");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке \n");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке \n");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке \n");
        }
        System.out.println("Задача 3");
        int year = 2001;
        if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0 && year >= 1584) {
            System.out.println(year + "год является високосным \n");
        } else {
            System.out.println("Год не является високосным \n");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime + "\n");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет \n");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Это зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Это весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Это летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
