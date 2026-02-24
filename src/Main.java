public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 19;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2
        int temperature = 4;

        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3
        int speed = 65; // Можешь менять это число для проверки

        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // Задача 4
        int age4 = 20; // Можно менять для проверки
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад.");
        } else if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете.");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу.");
        }

        // Задача 5
        int age5 = 10; // Возраст ребенка
        boolean hasAdult = true; // Есть ли взрослый рядом (true - да, false - нет)

        if (age5 < 5) {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе.");
        } else if (age5 >= 5 && age5 < 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + age5 + ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + age5 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6
        int count = 75; // Общее количество пассажиров в вагоне (можешь менять)
        int totalCapacity = 102;
        int sittingCapacity = 60;

        if (count < sittingCapacity) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (count >= sittingCapacity && count < totalCapacity) {
            System.out.println("Сидячих мест нет, но есть стоячие места.");
        } else {
            System.out.println("Вагон уже полностью забит.");
        }
    }
}