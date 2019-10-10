package lesson_1;
//5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
public class Task5 {
    public static void main(String[] args){
        int a = -1;
        System.out.println(calculateFunction(a));
        }
    public static String calculateFunction (int a){
        if (a >= 0){
            return "Положительное число";
        }else {
            return "Отрицательное число";
        }

    }
}
