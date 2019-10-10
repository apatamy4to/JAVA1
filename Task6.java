package lesson_1;

//6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
public class Task6 {
    public static void main(String[] args) {
        int a = -6;
        System.out.println(isNegativeNumber(a));
    }

    public static boolean isNegativeNumber(int a){
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }
}