package com.Palafox;

import java.util.ArrayList;
import java.util.HashMap;

public class DLP {
    public static void main(String[] args) {

            int pow = 4; //put your pow here

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
                    counter++;
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
        System.out.println(arrayList.size()+" elementos validos: " + arrayList);
        int random = (int) (Math.random()* arrayList.size());
        x =  arrayList.get(random);
        System.out.println(x);
        double a = (int) (Math.log(12375)/Math.log(106));
        a = Math.pow(a,x);
        a = a%pow;
        System.out.println(a);
    }
}
