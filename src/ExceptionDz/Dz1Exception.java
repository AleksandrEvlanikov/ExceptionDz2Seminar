package ExceptionDz;

import java.util.Scanner;

public class Dz1Exception {

//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
//    вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void FloatInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: " + '\n');
        Float input = scanner.nextFloat();
        System.out.println(input);


    }


}

