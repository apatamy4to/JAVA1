package lesson_1;

import javax.swing.*;

//7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
public class Task7 {
    public static void main(String[] args) {
       String name = "Денис";
        System.out.println(printHelloName(name));
    }
    public static String printHelloName(String name){
        String result = "Привет " + name + " !";
        return result;
    }
}
