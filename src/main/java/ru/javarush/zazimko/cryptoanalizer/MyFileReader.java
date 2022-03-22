package ru.javarush.zazimko.cryptoanalizer;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyFileReader {

    public List<Character> reader(String path) {
        List<Character> textFromFile = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path)) {
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
