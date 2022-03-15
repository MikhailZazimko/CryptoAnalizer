package ru.javarush.zazimko.cryptoanalizer;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyFileReader {

    public List<Character> reader() {
        System.out.println("Введите адрес файла для чтения");
        List<Character> textFromFile = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in); FileReader fileReader = new FileReader(scanner.nextLine())) {
            while (fileReader.ready()) {
                char read = (char) fileReader.read();
                textFromFile.add(read);
            }
          //  System.out.print(textFromFile);
        } catch (IOException| NullPointerException e) {
            System.out.println("Не найден файл для чтения");
        }
        return textFromFile;
    }
}
