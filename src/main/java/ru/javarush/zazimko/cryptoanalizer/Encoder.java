package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

public class Encoder {
    public static List<Character> encode(List<Character> reader, int key) {
        List<Character> decodeText = new ArrayList<>();
        for (char a : reader) {
            for (int j = 0; j < Alphabet.abc.length; j++) {
                if (a == Alphabet.abc[j]) {
                    if (j - key < 0) {
                        decodeText.add(Alphabet.abc[Alphabet.abc.length - (key - j)]);
                    } else {
                        decodeText.add(Alphabet.abc[j - key]);
                    }
                }
            }
        }
       // System.out.println(decodeText);
        return decodeText;
    }
}
