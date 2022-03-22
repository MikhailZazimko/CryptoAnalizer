package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Encoder {
    public static void encode(String source,int key, String path) {
        if(source==null||source==" "){
            source="C:\\test\\new\\decode.txt";
        }
        if (path==null||path==" "){
            path="C:\\test\\new\\encode.txt";
        }
        MyFileReader myFileReader = new MyFileReader();
        List<Character> Text =myFileReader.reader(source);
        List<Character> decodeText = new ArrayList<>();
        for (char a : Text) {
            for (int j = 0; j < Alphabet.abc.length; j++) {
                if (a == Alphabet.abc[j]) {
                   if(j-key<0&&Alphabet.abc.length-abs(j-key)<0){
                       decodeText.add(Alphabet.abc[abs(abs(Alphabet.abc.length - abs(key-j))-Alphabet.abc.length)]);
                   }
                    else if (j - key < 0) {
                        decodeText.add(Alphabet.abc[Alphabet.abc.length - abs(key-j)]);
                    } else {
                        decodeText.add(Alphabet.abc[j - key]);
                    }
                }
            }
        }
        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.writer(decodeText,path);

    }
}
