package com.Palafox;

public class DL {
    public static void main(String[] args) {
        double x;
        double B = 866;
        double a = 84;
        double p = 1031;
        x  = findB(B,a,p);

    }
    public static double findB(double B, double a, double p){
        double x = 0;
        double temp = 1;
        for (int i = 1; i < p; i++) {
            temp = a*temp;
            temp = temp%p;
            if(temp == B){
                System.out.println("B = "+i);
                x= i;
                break;
            }
        }
        if (x == 0){
            System.out.println("No se encontro B");
            return 0;
        }
        return x;

    }

}


