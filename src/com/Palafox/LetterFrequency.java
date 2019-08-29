package com.Palafox;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterFrequency {

    private HashMap<Character,Character> swap;
    private String txt;
    private char[] abc;
    private double[] frequency;
    private  int countAbcFrequency;

    public LetterFrequency(String txt) {
        abc = new char[26];
        frequency = new double[26];
        this.txt =txt;
        swap = new HashMap<>();
        swapInit();
        analysisInit();
    }

    public void decode(){
        Character aux;
        System.out.println("DECODING: " + txt);
        for (Character c :
                txt.toCharArray()) {
            System.out.print(swap.get(c));
        }
    }

    public  void analysis(){
        
    }
    private void analysisInit(){
        abcFrequency('a',8.167);
        abcFrequency('b',1.492);
        abcFrequency('c',2.782);
        abcFrequency('d',4.253);
        abcFrequency('e',12.702);
        abcFrequency('f',2.228);
        abcFrequency('g',2.015);
        abcFrequency('h',6.094);
        abcFrequency('i',6.966);
        abcFrequency('j',0.153);
        abcFrequency('k',0.772);
        abcFrequency('l',4.025);
        abcFrequency('m',2.406);
        abcFrequency('n',6.749);
        abcFrequency('o',7.507);
        abcFrequency('p',1.929);
        abcFrequency('q',0.095);
        abcFrequency('r',5.987);
        abcFrequency('s',6.327);
        abcFrequency('t',9.056);
        abcFrequency('u',2.758);
        abcFrequency('v',0.978);
        abcFrequency('w',2.360);
        abcFrequency('x',0.150);
        abcFrequency('y',1.974);
        abcFrequency('z',0.074);
    }

    private void abcFrequency(Character character,Double frequency){
        this.abc[countAbcFrequency]=character;
        this.frequency[countAbcFrequency]=frequency;
        countAbcFrequency++;
    }
    private void swapInit() {
        swap.put('a','B');
        swap.put('b','B');
        swap.put('c','B');
        swap.put('d','B');
        swap.put('e','B');
        swap.put('f','B');
        swap.put('g','B');
        swap.put('h','B');
        swap.put('i','B');
        swap.put('j','B');
        swap.put('k','B');
        swap.put('l','B');
        swap.put('m','B');
        swap.put('n','B');
        swap.put('o','B');
        swap.put('p','B');
        swap.put('q','B');
        swap.put('r','B');
        swap.put('s','B');
        swap.put('t','B');
        swap.put('u','B');
        swap.put('v','B');
        swap.put('w','B');
        swap.put('x','B');
        swap.put('y','B');
        swap.put('z','B');
        swap.put(' ',' ');
    }


}
