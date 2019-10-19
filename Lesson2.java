package Lesson_2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        invertArray();
        System.out.println("Задание №2");
        fillArray();
        System.out.println("\nЗадание №3");
        changeArray();
        System.out.println("\nЗадание №4");
        fillDiagonal();
        System.out.println("Задание №5");
        numberSearch();
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr1 = {0, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) arr1[i] = 0;
            else arr1[i] = 1;
        }
        System.out.println(Arrays.toString(arr1));
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.print(Arrays.toString(arr2));
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] = arr3[i] *= 2;
        }
        System.out.print(Arrays.toString(arr3));
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if ((i == j) || (i == arr4.length - 1 - j)) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void numberSearch() {
        int[] arr5 = {1, 2, 3};
        int min = arr5[0], max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный элемент " + min);
    }
}








