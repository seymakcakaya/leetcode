package org.example.merge.strings.alternately;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {

        String mergeStrings = "";

        int arraySize = word1.length() < word2.length() ? word1.length() : word2.length();
//        if (word1.length()>word2.length()) {
//            while (word1.length() != word2.length()) {
//                word2 = word2 + " ";
//            }
//        }

//        if (arraySize != word2.length()) {
//            while (arraySize != word2.length()) {
//                word2 = word2 + " ";
//
//
//            }
//        }

        char[] words1 = word1.toCharArray();

        char[] words2 = word2.toCharArray();
        for (int i = 0; i < arraySize; i++) {
            mergeStrings = mergeStrings+String.valueOf(words1[i]) +String.valueOf(words2[i]);
        }
        if (word1.length()<word2.length()){
            mergeStrings=mergeStrings+word2.substring(word1.length(),word2.length());
        }if (word1.length()>word2.length()){
            mergeStrings=mergeStrings+word1.substring(word2.length(),word1.length());
        }

        return mergeStrings;

    }
}
