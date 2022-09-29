public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");

        int age = 19; // Введи возраст

        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием");
        } else {
            System.out.println("Извини, но возраст совершеннолетия ещё не наступил, придется немного подождать.");
        }

        //Задание 2
        System.out.println("Задание 2");

        int age1 = 27; // Введите Ваш возраст

        if (age1 <= 6) {
            System.out.println("С такими запросами конечно рановато думать даже о школе, сопляк");
        } else {
            System.out.println("Здравствуйте");
        }
        if (age1 >= 7) {
            System.out.println("Вы явно школьник");
        } else {
            System.out.println("  ");
        }
        if (age1 >= 18) {
            System.out.println("Хотя откуда у Вас усы? Аааа, Вы выпуснкик, ну чтож пора в университет");
        } else {
            System.out.println("  ");
        }



        if (age1 >= 24) {
            System.out.println("Нет? Как уже закончили? Найдите в таком случае уже работу наконец");
        } else {
            System.out.println("  ");
        }

        //Задание 3
        System.out.println("Задание 3");

        int NumberInTheQueue = 200; // Укажите номер в очереди в вагон

        int carCapacity = 102;
        int sittingPlaces = 60;

        if (NumberInTheQueue <= sittingPlaces) {
            System.out.println("Добро пожаловать! Пока еще есть сидячие места");
        } else {
            System.out.println("Здравствуйте, одну минуточку, идет проверка вагона на наличие свободных мест");
        }

        if (NumberInTheQueue >= sittingPlaces) {
            System.out.println ("Извините, но вагоне остались только стоячие места, Вас устроит?");
        } else {
            System.out.println("Приятного пути");
        }

        if (NumberInTheQueue > carCapacity) {
            System.out.println ("Подождите, эх... сожалению вы не успели, мест больше нет! Пройдите в следующий вагон");
        } else {
            System.out.println(" ");
        }
    }
}