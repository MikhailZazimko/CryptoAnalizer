package ru.javarush.zazimko.cryptoanalizer;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {

    public void reader(){
        System.out.println("Введите адрес файла для чтения");
        List<Character>textFromFile=new ArrayList<>();
        try (Scanner scanner=new Scanner(System.in);FileReader fileReader=new FileReader(scanner.nextLine())){
           while (fileReader.ready()){
                char read= (char) fileReader.read();
                textFromFile.add(read);
           }
            System.out.print(textFromFile);
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }

    }
}
