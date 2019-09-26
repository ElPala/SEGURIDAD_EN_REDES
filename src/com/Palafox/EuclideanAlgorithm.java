package com.Palafox;
import java.math.BigInteger;
public class EuclideanAlgorithm
{
    public BigInteger xeuclid( BigInteger a, BigInteger b )
    {
        BigInteger mx ,my;
        mx = a;
        my =b;
        BigInteger[] x = new BigInteger[2];
        BigInteger[] y = new BigInteger[2];
        BigInteger q, r, xx, yy;
        int sign;        // Initializes the coefficients
        x[0] = BigInteger.ONE;
        x[1] = BigInteger.ZERO;
        y[0] = BigInteger.ZERO;
        y[1] = BigInteger.ONE;
        sign = 1;        // As long as b != 0 we replace a by b and b by a % b.
        while( !b.equals( BigInteger.ZERO ) )
        {
            r = a.mod( b );
            q = a.divide( b );
            a = b;
            b = r;
            xx = x[1];
            yy = y[1];
            x[1] = ( q.multiply( x[1] ).add( x[0] ) );
            y[1] = ( q.multiply( y[1] ).add( y[0] ) );
            System.out.println(a +", "+ b);
            x[0] = xx;
            y[0] = yy;


            sign = -sign;
            if(sign != 1){
                System.out.println(" x / "+mx+": -" + x[0] );
                System.out.println(" y / "+my+": " + y[0] );
            }else {
                System.out.println(" x / "+mx+": " + x[0] );
                System.out.println(" y / "+my+": -" + y[0] );
            }
        }        // Final computation of the coefficients
        x[0] = x[0].multiply( new BigInteger( String.valueOf( sign ) ) );
        y[0] = y[0].multiply( new BigInteger( String.valueOf( -sign ) ) );
        System.out.println("/////////////////////////////");
        System.out.println(" x : " + x[0] );
        System.out.println(" y : " + y[0] );
         return a;
    }
    public static void main(String[] args)
    {
    BigInteger a = new BigInteger("65537");
    BigInteger b = new BigInteger("2199052615776");
    EuclideanAlgorithm ea = new EuclideanAlgorithm();
    System.out.println( ea.xeuclid(a,b)   );
    }
}