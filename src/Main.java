public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2012;
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear >= 2015 && clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        // Задание 3
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        // Задание 4

        int deliveryDistance = 95;
        int minDistance = 20;
        int oneStep = 40;
        int DeliveryDays = 1;
        if ( deliveryDistance > minDistance) {
            DeliveryDays += ( (deliveryDistance-minDistance) / oneStep);
            if ( (deliveryDistance - minDistance )% oneStep > 0){
                DeliveryDays++;
            }
        }
        System.out.println("Потребуется дней: " + DeliveryDays);

                // Задание 5
                int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

            }

        }

