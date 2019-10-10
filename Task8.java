package lesson_1;
//8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Task8 {
    public static void main(String[] args) {
        int year = 1900;
        System.out.println(isLeapYear(year));
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {

}