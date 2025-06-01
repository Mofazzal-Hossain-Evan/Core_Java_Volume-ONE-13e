import java.math.BigInteger;
import java.util.Random;

public class RSABasics {

    public static void main(String[] args) {
        Random rnd = new Random();

        BigInteger p = BigInteger.probablePrime(512, rnd);
        BigInteger q = BigInteger.probablePrime(512, rnd);

        BigInteger n = p.multiply(q);

        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));

        BigInteger e = BigInteger.valueOf(65537);

        BigInteger d = e.modInverse(phi);

        System.out.println("Public Key (n, e): " + n + ", " + e);
        System.out.println("Private Key (d): " + d);

        BigInteger message = BigInteger.valueOf(1234);
        BigInteger encrypted = message.modPow(e, n);
        BigInteger decrypted = encrypted.modPow(d, n);

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encrypted);
        System.out.println("Decrypted Message: " + decrypted);
    }
}
