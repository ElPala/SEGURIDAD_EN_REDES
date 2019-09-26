package com.Palafox;

import java.math.BigInteger;

public class Prime {
    public static void main(String[] args) {

        BigInteger x =  new BigInteger("34359738421");

        boolean j =true;
        for (BigInteger dos = new BigInteger("2"); !dos.equals(x); dos=dos.add(BigInteger.ONE)) {
            if((x.mod(dos).equals(BigInteger.ZERO))){
                j =false;
                System.out.println("no es primo, con "+dos);
            }

        }
        if(j){
            System.out.println("Si es primo");
        }
    }
}
