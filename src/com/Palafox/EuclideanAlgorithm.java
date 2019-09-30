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
        System.out.println(" y : " + y[0].mod(my) );
         return a;
    }

    public BigInteger xeuclid( BigInteger a, BigInteger b ,BigInteger m )
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
        System.out.println(" y : " + y[0].mod(mx) );
        System.out.println(" y : " + y[0].mod(mx) );

        return a;
    }

    public static void main(String[] args)
    {

        String prime1 ="00:fc:9d:5d:6f:f1:63:c2:6f:ce:3c:2b:13:b2:f8:    fa:89:54:34:69:13:2b:a5:35:27:29:7a:f7:11:6e:    2a:84:13:d8:3b:d5:7f:9c:bf:f5:0d:0b:e4:1e:bb:    cb:38:39:5c:ac:8d:48:ee:10:26:4c:3d:93:cf:35:    45:1a:db:7d:86:ae:13:33:bc:fe:70:f2:7b:90:74:    ae:b0:2f:80:f1:7b:ea:b0:80:76:a6:b4:da:e4:06:    8b:ab:19:59:7e:ef:38:09:51:64:82:2c:9e:70:5b:    54:53:dc:10:76:11:46:23:e7:d5:8f:50:8b:09:09:    b2:5a:34:ba:31:e7:01:ba:e2:e9:94:08:42:e7:ec:    3f:0f:66:00:6a:ef:97:fb:95:7d:e2:89:75:8b:2d:    d3:56:04:dd:4d:fd:2c:28:0a:15:d0:c0:04:6b:84:    8b:e7:72:73:87:74:e0:51:d4:d7:9d:bb:8a:31:d8:    47:fd:41:51:58:c5:43:21:a5:ec:54:c5:db:03:ba:    b4:10:49:4c:6b:cf:24:58:3e:83:f1:e8:b3:a3:4a:    b9:71:28:b5:e1:6b:be:12:51:e4:3e:cc:53:6e:bc:    e8:c2:1e:c3:f4:18:36:b9:c1:6b:70:06:86:cf:4f:    52:1e:c1:79:3b:0c:dc:54:45:22:37:27:45:3a:c3:    7a:97";
        prime1= prime1.replaceAll("[^\\n\\r\\t\\p{Print}]", "");
        prime1= prime1.replaceAll(" ", "");
        prime1= prime1.replaceAll(":", "");

        System.out.println(prime1);

        String prime2 = "00:ea:8b:83:44:fb:a3:04:af:98:86:3c:8a:34:ab:    f5:93:99:54:f4:ef:5a:d5:3d:35:1a:bf:27:2f:7d:    d3:7d:2a:bf:d4:11:76:b9:e0:9e:5e:90:4f:db:17:    34:51:9a:c7:44:38:6e:80:fd:26:3d:c7:ee:b7:80:    1d:52:49:17:da:3e:0c:a1:90:52:d4:23:47:37:b4:    bd:f8:e2:7d:52:e3:cf:1c:92:87:3e:f1:75:76:4a:    cd:26:4f:a2:5a:b8:8d:de:47:82:e0:84:13:17:70:    61:7a:15:62:ef:99:1a:10:23:9f:81:b5:2e:42:72:    28:94:31:dc:ae:38:df:2c:f8:d2:63:e1:fd:15:6e:    25:e0:2a:c6:25:ef:85:a7:c5:0b:ad:98:6f:54:dd:    f5:35:e5:6a:af:66:be:5b:08:d5:f9:f4:13:8e:3e:    61:97:52:b3:ba:2f:20:11:f1:d9:7b:c2:48:59:f7:    ab:0b:46:53:e5:36:f3:65:d9:ab:2b:16:5a:ef:c9:    d5:b4:9f:98:2f:0d:68:f5:1b:86:9d:a5:2a:19:bc:    81:d8:ce:29:c0:fe:c2:b7:be:b4:f4:b6:ce:7c:fa:    11:25:5f:6f:f9:68:33:dd:c0:97:74:41:5f:24:85:    75:72:70:44:11:06:6b:41:b8:f4:1a:01:a7:62:fe:    99:79" ;
        prime2= prime2.replaceAll("[^\\n\\r\\t\\p{Print}]", "");
        prime2= prime2.replaceAll(" ", "");
        prime2= prime2.replaceAll(":", "");


        String m = "00:c9:fc:fc:f2:a9:11:45:29:36:61:22:5c:89:05:    41:e5:a2:26:79:e5:b1:3b:ad:c1:7e:31:64:9d:87:    9a:ea:07:4b:34:39:d6:08:79:18:25:83:ba:3c:35:    09:e2:33:de:d4:ba:64:67:6c:39:45:9d:5f:53:9f:    c7:6a:f9:90:b6:a9:32:2f:8d:b1:44:78:e8:6a:a7:    13:3b:ad:d7:c8:5f:3b:db:bf:31:20:25:57:89:85:    25:76:e6:7f:77:c5:01:36:aa:29:f0:75:ba:14:0f:    4e:f9:5b:c6:e1:d1:25:8f:0f:de:99:b5:9b:6e:92:    f2:7a:32:b8:8f:f6:1b:3c:75:f7:a4:41:2d:b3:61:    1b:e7:66:9e:6e:b1:e5:0d:70:4a:52:92:05:3e:b7:    ac:31:ca:48:a9:27:d4:23:a2:f4:55:59:f7:e8:28:    0a:96:24:c9:39:16:73:79:ad:fc:c0:50:8f:79:28:    3e:06:a8:f8:3d:3c:c5:29:6c:1a:0b:69:a4:9f:1d:    d9:bf:fb:7e:17:8a:eb:b4:fc:a7:5d:8d:19:e0:2f:    65:bc:12:c7:4c:7a:74:de:20:84:60:f6:02:60:bc:    29:91:84:24:92:f8:8f:3e:ec:6a:96:3f:5c:62:44:    c7:23:be:67:21:1e:b2:15:24:e7:06:62:2c:ea:21:    7f:59";
        m= m.replaceAll("[^\\n\\r\\t\\p{Print}]", "");
        m= m.replaceAll(" ", "");
        m= m.replaceAll(":", "");

        String j = " 00:8a:5a:69:80:65:61:d8:f7:a3:b1:e0:f1:75:41:    4e:a3:d5:ef:78:eb:65:fc:b4:c5:a6:84:7a:a0:94:    73:fd:fd:44:fb:de:e9:c6:1f:fb:f4:26:48:78:58:    f4:0e:26:ed:68:d4:cb:55:34:01:fe:b7:0e:c6:9e:    d8:df:63:56:46:67:9a:62:8c:31:71:ef:47:73:56:    41:8c:4d:45:52:90:38:d6:0a:1d:c2:21:11:d6:b6:    86:b4:ec:a9:3f:06:88:10:43:7a:3a:a4:c8:f2:58:    92:05:a7:61:90:e7:cb:4c:34:d8:8a:7c:a4:9c:96:    b6:d4:10:cd:ee:7d:ea:a5:fc:07:69:0f:7e:bd:04:    7f:71:f6:19:e7:2f:a0:27:76:6e:f6:92:40:2e:68:    83:7b:92:39:b8:96:12:89:f6:aa:9d:b3:de:e0:ed:    a0:96:2d:02:50:62:83:b5:79:83:d7:3e:c2:b0:3c:    7e:c3:37:d2:01:f9:33:d5:ee:03:bd:34:db:8c:a6:    d1:d4:f8:23:79:5f:06:14:a8:8c:15:c3:ad:f4:7d:    1f:78:f4:bb:02:14:c7:86:8c:17:cb:d9:df:2b:af:    17:56:10:ac:30:e1:78:4f:b6:63:f9:92:a8:61:d2:    c9:63:36:1d:5e:ee:c8:6d:18:1a:f7:4e:9f:ed:9c:    b7:49";
        j= j.replaceAll("[^\\n\\r\\t\\p{Print}]", "");
        j= j.replaceAll(" ", "");
        j= j.replaceAll(":", "");
        BigInteger myj = new BigInteger(j,16);
        System.out.println("my j : "+myj);

        BigInteger mym = new BigInteger(m,16);
        System.out.println(prime2);
        BigInteger x  = new BigInteger(prime1,16);
        BigInteger y  = new BigInteger(prime1,16);
        BigInteger menos = new BigInteger("-1");
        //menos = menos.negate();
        BigInteger z  = (x.add(menos)).multiply(y.add(menos));
        BigInteger a = new BigInteger("65537");
        BigInteger b = new BigInteger("2199052615776");
        EuclideanAlgorithm ea = new EuclideanAlgorithm();
        //System.out.println( ea.xeuclid(a,b)   );
        System.out.println( ea.xeuclid(z,new BigInteger("65537"),mym));
    }
}