package com.Palafox;

import java.math.BigInteger;

public class RSA {
    public static void main(String[] args) {
        BigInteger base =  new BigInteger("510154320953");
        BigInteger pow =  new BigInteger("453554392289");
        BigInteger mod =  new BigInteger("2199055761527");
        BigInteger result = base.modPow(pow,mod);
        System.out.printf("result: "+ result);

    }
}
