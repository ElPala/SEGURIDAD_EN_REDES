package com.Palafox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LetterFrequency {

    private HashMap<Character, Character> swap;
    private String txt;
    private char[] abc;
    private double[] frequency;
    private int countAbcFrequency;
    String anothertxt;
    public LetterFrequency(String txt) {
        txt.toLowerCase();
        anothertxt =txt;
        abc = new char[26];
        frequency = new double[26];
        String aux="";
        for (Character c :
                txt.toCharArray()) {
            if(c != ' '){
                aux+=c;
            }
        }
        txt = aux;
        txt.toLowerCase();
        this.txt = txt;
        swap = new HashMap<>();
        swapInit();
        analysisInit();
    }

    public void decode() {
        Character aux;
        System.out.println("DECODING: " + txt);
        System.out.println();
        int counnt=0;
        for (Character c :
                anothertxt.toCharArray()) {
            if(c != ' ')
             System.out.print(swap.get(c));
            else
                System.out.printf(" ");
        }
    }

    public void analysis() {
        char[] abc;
        int[] count;
        count = new int[26];
        abc = new char[26];

        for (int i = 0; i < 26; i++) {
            count[i] = 0;
            abc[i] = (char) (i + 97);
        }
        int aux;
        for (Character c :
                txt.toCharArray()) {
            if(c == ' ')
                continue;
            aux = c -97;
            count[aux]++;
        }
        double total = 0;
        char x;
        //System.out.println(txt.length());
        for (int i = 0; i < 26; i++) {
            total = count[i];
            total*=100;
            total /= (double) txt.length();
            x = changinletter(abc[i],total);
            System.out.println("La letra " + abc[i] +" aparecio: "+ count[i]+" con frequencia " + total+ " puede ser la letra "+ x );
            abc[i] = (char) (i + 97);
        }


    }

    private  char changinletter(char character, double aprox){
        double errorminimo=1000000000;
        double aux= 0;
        Character c='a';
        for (int i = 0; i < 26; i++) {
            aux = (double) (aprox -frequency[i]);
            aux = (double) Math.abs(aux);
            //System.out.println( aux);
            if(aux<errorminimo){
                errorminimo=aux;
                c = abc[i];
            }
        }
        swap.put(character, c);
        return c;
    }
    private void analysisInit() {
        abcFrequency('a', 8.167);
        abcFrequency('b', 1.492);
        abcFrequency('c', 2.782);
        abcFrequency('d', 4.253);
        abcFrequency('e', 12.702);
        abcFrequency('f', 2.228);
        abcFrequency('g', 2.015);
        abcFrequency('h', 6.094);
        abcFrequency('i', 6.966);
        abcFrequency('j', 0.153);
        abcFrequency('k', 0.772);
        abcFrequency('l', 4.025);
        abcFrequency('m', 2.406);
        abcFrequency('n', 6.749);
        abcFrequency('o', 7.507);
        abcFrequency('p', 1.929);
        abcFrequency('q', 0.095);
        abcFrequency('r', 5.987);
        abcFrequency('s', 6.327);
        abcFrequency('t', 9.056);
        abcFrequency('u', 2.758);
        abcFrequency('v', 0.978);
        abcFrequency('w', 2.360);
        abcFrequency('x', 0.150);
        abcFrequency('y', 1.974);
        abcFrequency('z', 0.074);
    }

    private void abcFrequency(Character character, Double frequency) {
        this.abc[countAbcFrequency] = character;
        this.frequency[countAbcFrequency] = frequency;
        countAbcFrequency++;
    }

    private void swapInit() {
        swap.put('a', 'k');
        swap.put('b', 't');
        swap.put('c', 'k');
        swap.put('d', 't');
        swap.put('e', 'l');
        swap.put('f', 'j');
        swap.put('g', 'z');
        swap.put('h', 'l');
        swap.put('i', 's');
        swap.put('j', 'o');
        swap.put('k', 's');
        swap.put('l', 'b');
        swap.put('m', 'a');
        swap.put('n', 'u');
        swap.put('o', 'v');
        swap.put('p', 'h');
        swap.put('q', 'd');
        swap.put('r', 'e');
        swap.put('s', 'c');
        swap.put('t', 'p');
        swap.put('u', 'l');
        swap.put('v', 'c');
        swap.put('w', 'i');
        swap.put('x', 'f');
        swap.put('y', 'c');
        swap.put('z', 'z');
        swap.put(' ', ' ');
    }

    public static void main(String[] args) {
        String txt;
        CifradoCesar cifradoCesar;

    LetterFrequency letterFrequency;
    Scanner scanner;
    scanner = new Scanner(System.in);
    txt =scanner.nextLine();
    letterFrequency = new LetterFrequency(txt);
    //letterFrequency.analysis();
    letterFrequency.decode();

    }
}
