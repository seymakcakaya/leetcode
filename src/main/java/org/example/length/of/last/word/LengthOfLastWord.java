package org.example.length.of.last.word;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
    int lastBlankIndex=s.lastIndexOf(" ");
    int lengthOfLastWord=0;
    String noBlankString=s;
                while(lastBlankIndex==noBlankString.length()-1){

                        noBlankString= s.substring(0,lastBlankIndex);
                        lastBlankIndex=noBlankString.lastIndexOf(" ");
                }

        lengthOfLastWord=noBlankString.substring(lastBlankIndex+1,noBlankString.length()).length();


        return lengthOfLastWord;
    }
}
