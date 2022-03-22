package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static List<Character> text=new ArrayList<>();
    public static void main(String[] args) {
//        String source="C:\\test\\new\\file1.txt";
//        String str="C:\\test\\new\\decode.txt";
//      Decoder.decode(source,2,null);
//     String str2="C:\\test\\new\\encode.txt";
//      Encoder.encode(str,2,str2);
        String bruteEncode="C:\\test\\new\\BruteForce.txt";
        BruteForce bruteForce = new BruteForce();
        bruteForce.decode("C:\\test\\new\\decode.txt",bruteEncode);
    }
}
