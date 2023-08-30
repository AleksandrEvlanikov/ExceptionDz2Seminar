package ExceptionDz;

import java.util.InputMismatchException;

import static ExceptionDz.Dz1Exception.FloatInput;
import static ExceptionDz.Dz4Exception.EmptyLines;

public class main {
    public static void main(String[] args) {
        while (true) {
            try {
                //FloatInput();
                EmptyLines();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод данных.");
                System.out.println("Попробуйте еще раз");
            }catch (Exception e) {
                System.out.println("Строка пустая." + e.getMessage());
                System.out.println("Введите буквы");
            }
        }

    }
}
