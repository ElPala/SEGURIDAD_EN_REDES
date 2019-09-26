package com.Palafox;

import java.math.BigInteger;

public class Phi {

    public static void main(String[] args) {
        BigInteger x = new BigInteger("2199055761527");
        for (BigInteger i = new BigInteger("1");!i.equals(x); i = i.add(BigInteger.ONE)){
            if((x.mod(i)).equals(BigInteger.ZERO)){
                System.out.println(""+i);
                x = x.divide(i);
            }
        }
    }
}
