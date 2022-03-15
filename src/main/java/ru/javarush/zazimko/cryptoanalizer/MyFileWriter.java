package ru.javarush.zazimko.cryptoanalizer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MyFileWriter {

    public void writer(List<Character> reader, String str){


        try ( FileWriter fileWriter=new FileWriter(str) ){
            StringBuilder text=new StringBuilder();
            for (Character character : reader) {
                text.append(character);
            }
            String textToWrite= text.toString();
              fileWriter.write(textToWrite);
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }

    }
}
