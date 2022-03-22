package ru.javarush.zazimko.cryptoanalizer;

import ru.javarush.zazimko.cryptoanalizer.View.SwingForm;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static List<Character> text=new ArrayList<>();
    public static void main(String[] args) {
       String source="C:\\test\\new\\file1.txt";
       String dest="C:\\test\\new\\decode.txt";
      //Decoder.decode(null,2,null);
//     String pathForEncode="C:\\test\\new\\encode.txt";
//      Encoder.encode(null,2,null);
//        String bruteEncode="C:\\test\\new\\BruteForce.txt";
//        BruteForce bruteForce = new BruteForce();
//        bruteForce.decode("C:\\test\\new\\decode.txt",bruteEncode);
        SwingForm swingForm = new SwingForm();
    }
}
