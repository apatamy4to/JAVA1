package lesson_1;
//3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
public class Task3 {
    public static void main (String[] args) {
    int a = 5;
    int b = 10;
    int c = 15;
    int d = 3;
 System.out.println(calculateFunction(a, b, c, d));
    }
    public static int calculateFunction(int a, int b, int c, int d){
        int result = a * (b + (c / d));
        return result;
    }

}
