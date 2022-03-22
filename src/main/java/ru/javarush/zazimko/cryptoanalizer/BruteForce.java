package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class BruteForce {
    public static int key=0;
    public static void decode(String path,String pathWrite) {
        List<Character> finalText=new ArrayList<>();
        MyFileReader myFileReader = new MyFileReader();
        List<Character> encodeText = myFileReader.reader(path);
        for (char a : encodeText) {
            for (int j = 0; j < Alphabet.abc.length; j++) {
                if (a == Alphabet.abc[j]) {
                    if (j - key < 0) {
                        finalText.add(Alphabet.abc[Alphabet.abc.length - abs(key - j)]);
                    } else {
                        finalText.add(Alphabet.abc[j - key]);
                    }
                }
            }
        }
        StringBuilder encodeString=new StringBuilder();
        for (Character character : finalText) {
          encodeString.append(character);
        }
        String regex="[а-я]+\\.\\s";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(encodeString);
        if(matcher.find()){
            MyFileWriter myFileWriter = new MyFileWriter();
            myFileWriter.writer(finalText,pathWrite);
        }else {
            key++;
            decode(path, pathWrite);
        }

    }
}
