package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static List<Character> text=new ArrayList<>();
    public static void main(String[] args) {
     MyFileReader one=new MyFileReader();
    text= one.reader();

      MyFileWriter two=new MyFileWriter();
      String str="C:\\test\\new\\file11.txt";
      two.writer(text,str);
    }
}
