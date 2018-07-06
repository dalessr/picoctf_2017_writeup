import java.math.BigInteger;
import java.util.ArrayList;

public class BruteForce {
    public static void main(String args[]) {
        BigInteger dp = new BigInteger("3229249396565645680932270225067863220868604476746998731543638523417926260889330866970981867504130463063281063059451886197327583778327232473279705448033663");
        ArrayList<BigInteger> factors = tdFactors(dp);
        // for (BigInteger b : factors) {
        //     System.out.println(b.toString());
        // }
    }
    public static ArrayList<BigInteger> tdFactors(BigInteger n)
    {
        BigInteger two = BigInteger.valueOf(2);
        ArrayList<BigInteger> fs = new ArrayList<>();

        if (n.compareTo(two) < 0)
        {
            throw new IllegalArgumentException("must be greater than one");
        }

        while (n.mod(two).equals(BigInteger.ZERO))
        {
            fs.add(two);
            System.out.println(two.toString());
            n = n.divide(two);
        }

        if (n.compareTo(BigInteger.ONE) > 0)
        {
            BigInteger f = BigInteger.valueOf(3);
            while (f.multiply(f).compareTo(n) <= 0)
            {
                if (n.mod(f).equals(BigInteger.ZERO))
                {
                    fs.add(f);
                    System.out.println(f.toString());
                    n = n.divide(f);
                }
                else
                {
                    f = f.add(two);
                }
            }
            fs.add(n);
            System.out.println(n.toString());
        }

        return fs;
    }
}
