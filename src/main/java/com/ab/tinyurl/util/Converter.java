package com.ab.tinyurl.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Arpit Bhardwaj
 */
public class Converter {

    private static Converter instance;
    private List<Character> indexToChar;
    private Converter(){
        indexToChar = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            char c = 'a';
            c += i;
            indexToChar.add(c);
        }
        for (int i = 26; i < 52; i++) {
            char c = 'A';
            c += (i - 26);
            indexToChar.add(c);
        }
        for (int i = 52; i < 62; i++) {
            char c = '0';
            c += (i - 52);
            indexToChar.add(c);
        }
    }
    public static Converter getInstance() {
        if (instance != null){
            return instance;
        }
        return new Converter();
    }

    public String generateUniqueId(long id) {
        List<Integer> base62Id = convertBase10ToBase62(id);
        StringBuilder uniqueId = new StringBuilder();
        for (int digit:
             base62Id) {
            uniqueId.append(indexToChar.get(digit));
        }
        return uniqueId.toString();
    }

    private List<Integer> convertBase10ToBase62(long id) {
        LinkedList<Integer> base62 = new LinkedList<>();

        while (id > 0){
            int remainder = (int) (id % 62);
            base62.addFirst(remainder);
            id /= 62;
        }
        return base62;
    }
}
