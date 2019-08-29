package com.Palafox;

import java.util.Scanner;

public class CifradoCesar {
    public final int base = 26;
    private char[] abc;
    private String txt;

    public char[] getSentence() {
        return sentence;
    }

    public void setSentence(char[] sentence) {
        this.sentence = sentence;
    }

    private char[] sentence;
    public CifradoCesar(String sentence) {
        txt = sentence;
        sentence.toLowerCase();
        setSentence(sentence.toCharArray());
        abcfill();
    }
    private void abcfill(){
        int aux;
        abc =  new char[26];
        for (int i = 0; i < 26; i++) {
            aux = i + 97;

            abc[i] = (char) aux;
        }
    }

    public void decode(){
        char character;
        int pos;
        System.out.println("DECODING: " + txt);
        for (int i = 1; i < 27; i++) {
            System.out.print(i + ".- ");
            for (int j = 0; j < sentence.length; j++) {
                character = sentence[j];
                if (character == ' ') {
                    System.out.print(" ");
                    continue;
                }
                pos = (character - base + i) % 26;
                character = abc[pos];
                System.out.print(character);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        CifradoCesar cifradoCesar;
        Scanner scanner;
        String txt;

        scanner = new Scanner(System.in);
        txt = scanner.nextLine();
        cifradoCesar = new CifradoCesar(txt);
        cifradoCesar.decode();
    }
}
