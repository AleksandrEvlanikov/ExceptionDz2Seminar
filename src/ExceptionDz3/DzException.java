package ExceptionDz3;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static ExceptionDz3.SaveToFile.fileToSaveSurname;

public class DzException {


//    private String name;
//    private String surname;
//    private String patronymic;
//    private String dateOfBirth;
//    private char gender;
//
//    public DzException(String name, String surname, String patronymic, String dateOfBirth, char gender) {
//        this.name = name;
//        this.surname = surname;
//        this.patronymic = patronymic;
//        this.dateOfBirth = dateOfBirth;
//        this.gender = gender;
//    }

    public static void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел Фамилия Имя Отчество датарождения номертелефона пол(F или M) ");
        String inputText = scanner.nextLine();
        String[] dataParts = inputText.split(" ");

        if (dataParts.length != 6) {
            System.out.println("Неверное количество данных.");
        }else {
            String name = dataParts[1];
            String surname = dataParts[0];
            String patronymic = dataParts[2];
            String dateOfBirth = dataParts[3];
            boolean validDate = false;
            while (!validDate) {
                try {
                    DateFormat formatter = new SimpleDateFormat("MM.dd.yyyy");
                    Date data = formatter.parse(dataParts[3]);
                    dateOfBirth = formatter.format(data);
                    validDate = true;
                } catch (ParseException e) {
                    System.out.println("Ошибка ввода даты рождение. Формат должен быть MM.DD.YYYY");
                    System.out.println("Введите дату еще раз ");
                    inputText = scanner.nextLine();
                    dataParts[3] = inputText;

                }
            }
            char gender = dataParts[5].charAt(0);
            while (gender != 'F' && gender != 'M'){
                System.out.println("Неправильное значение пола. Введите F или M. ");
                inputText = scanner.nextLine();
                dataParts[5] = inputText;
                gender = dataParts[5].charAt(0);
            }

            long numberTell = 0;
            boolean validNumber = false;
            while (!validNumber) {
                try {
                    numberTell = Long.parseLong(dataParts[4]);
                    validNumber = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка ввода номера телефона");
                    System.out.println("Введите номер еще раз ");
                    inputText = scanner.nextLine();
                    dataParts[4] = inputText;


                }
            }
            fileToSaveSurname(surname, name, patronymic, dateOfBirth, numberTell, gender);


//            System.out.println("Фамилия: " + surname);
//            System.out.println("Имя: " + name);
//            System.out.println("Отчество: " + patronymic);
//            System.out.println("Дата рождения: " + dateOfBirth);
//            System.out.println("Номер телефона: " + numberTell);
//            System.out.println("Пол: " + gender);
        }

    }
}
