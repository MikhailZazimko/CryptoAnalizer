package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static List<Character> text=new ArrayList<>();
    public static void main(String[] args) {
     MyFileReader one=new MyFileReader();
    text= one.reader();


      MyFileWriter two=new MyFileWriter();
      String str="C:\\test\\new\\decode.txt";
      text=Decoder.decode(text,12);
      two.writer(text,str);
        String str2="C:\\test\\new\\encode.txt";
      two.writer(Encoder.encode(text,12),str2);
    }
}
