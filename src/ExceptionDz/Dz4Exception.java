package ExceptionDz;

import java.util.Scanner;

public class Dz4Exception {

//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
   static public void EmptyLines() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String text = scanner.nextLine();
        if (!text.isEmpty()) {
            System.out.println(text);
        } else {
            throw new Exception("Строка пустая.");
        }
    }
}

