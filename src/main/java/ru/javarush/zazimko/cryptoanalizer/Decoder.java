package ru.javarush.zazimko.cryptoanalizer;

import java.util.ArrayList;
import java.util.List;

public class Decoder {
    public static List<Character> decode(List<Character> reader, int key) {
        List<Character> decodeText = new ArrayList<>();
        for (char a : reader) {
            for (int j = 0; j < Alphabet.abc.length; j++) {
                if (a == Alphabet.abc[j]) {
                    if (j + key >= Alphabet.abc.length) {
                        decodeText.add(Alphabet.abc[key - (Alphabet.abc.length - j)]);
                    } else {
                        decodeText.add(Alphabet.abc[j + key]);
                    }
                }
            }
        }
        //System.out.println(decodeText);
        return decodeText;
    }
}
