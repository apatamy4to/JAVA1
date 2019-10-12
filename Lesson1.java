package lesson_1;

public class Lesson1 {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 15;
        int d = 3;
        String name = "Денис";
        System.out.println(calculateFunction(a, b, c, d));
        System.out.println(numberComparison(a, b));
        System.out.println(numberCheck(a));
        System.out.println(isNegativeNumber(a));
        System.out.println(printHelloName(name));
    }

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    public static void task1() {
        byte a = 5;
        short b = -50;
        int c = 12345;
        long d = 12324241222L;
        char f = 'H';
        double g = 10.10;
        float h = 10.10000000000f;
        boolean i = true;
        String k = "Тестирование";
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода
    public static int calculateFunction(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean numberComparison(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static String numberCheck(int a) {
        if (a >= 0) {
            return "Положительное число";
        } else {
            return "Отрицательное число";
        }
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean isNegativeNumber(int a) {
        return a < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static String printHelloName(String name) {
        return "Привет " + name + " !";
    }
}



