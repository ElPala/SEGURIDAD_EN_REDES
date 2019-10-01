package com.Palafox;

import java.math.BigInteger;

public class Phi {

    public static void main(String[] args) {
        BigInteger x = new BigInteger("2199055761527");
        BigInteger y;
        BigInteger menosuno =  BigInteger.ONE;
        menosuno =  menosuno.negate();
        for (BigInteger i = new BigInteger("2");!i.equals(x); i = i.add(BigInteger.ONE)){
            if((x.mod(i)).equals(BigInteger.ZERO)){
                System.out.printf("("+i);
                y = x.divide(i);
                System.out.printf(")("+y+") = " + x);

                i = i.add(menosuno);
                y = y.add(menosuno);
                System.out.println();
                System.out.printf("("+i + ")(" +y+") = ");
                i = i.multiply(y);


                System.out.println("PHI = " + i);
                return;
            }
        }
    }
}
