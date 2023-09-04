package ExceptionDz3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

     static public void fileToSaveSurname(String surname, String name, String patronymic, String dateOfBirth, long numberTell, char gender) {

        try {
            File file = new File(surname + ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(surname + " " + name + " " + patronymic + " " + dateOfBirth + " " + numberTell + " " + gender);
            bw.newLine();
            bw.close();
            System.out.println("Данные успешно записаны в файл " + file.getName());


        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл" + e.getMessage());
        }
    }
}
