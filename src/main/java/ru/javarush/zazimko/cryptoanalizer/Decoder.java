package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Decoder {
    public static void decode(String source, int key, String path) {
        if(path==null||path==" "){
            path="C:\\test\\new\\decode.txt";
        }
        if (source==null||source==" "){
            source="C:\\test\\new\\file1.txt";
        }
        MyFileReader myFileReader = new MyFileReader();
        List<Character> originalText =myFileReader.reader(source);
        List<Character> decodeText = new ArrayList<>();
        for (char a : originalText) {
            for (int j = 0; j < Alphabet.abc.length; j++) {
                if (a == Alphabet.abc[j]) {
                    int index=j+key;
                    if (index/2>= Alphabet.abc.length) {
                        decodeText.add(Alphabet.abc[(j+abs(key-Alphabet.abc.length))-Alphabet.abc.length]);
                    } else if(index>= Alphabet.abc.length){
                        decodeText.add(Alphabet.abc[j+(key-Alphabet.abc.length)]);
                    }else {
                        decodeText.add(Alphabet.abc[j + key]);
                    }
                }
            }
        }
        MyFileWriter myFileWriter = new MyFileWriter();
        myFileWriter.writer(decodeText,path);
    }
}
