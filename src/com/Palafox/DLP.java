package com.Palafox;

import java.util.ArrayList;
import java.util.HashMap;

public class DLP {
    public static void main(String[] args) {

        int pow = 11;
        int x=1;
        int max = 0;
        int counter = 0;
        int primero = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a = 2; a < pow; a++) {
            System.out.printf("{");
            for (int i = 0; i != pow; i++) {
                x = a*x;
                x = x%pow;

                System.out.printf("{"+x+"}");
                if (i==0){
                    primero = x;

                }else if(x==primero){
                    if (max<counter){
                        max = counter;
                        arrayList.clear();
                        arrayList.add(a);
                    }else if(counter == max){
                        arrayList.add(a);
                    }
                    System.out.printf("} con un total de:" + counter);
                    break;
                }else {
                    counter++;
                }
            }
            x=1;
            counter = 0;
            System.out.println();
        }
        System.out.printf("Elementos validos: " +arrayList);

    }
}
