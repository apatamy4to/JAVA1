package lesson_1;

import java.security.spec.RSAOtherPrimeInfo;

//4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b =10;
        System.out.println(calculateFunction(a, b));
    }
    public static boolean calculateFunction(int a, int b){
        if (a + b >= 10 && a + b <= 20){
            return true;
        }else {
            return false;
        }
    }
}
