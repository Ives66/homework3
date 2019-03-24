import org.junit.Test;


public class PrimeTest {

    Prime prime =new Prime();

    @Test
    public void testPrintPrimes1() {
        prime.printPrimes(1);
    }

    @Test
    public void testPrintPrimes2() {
        prime.printPrimes(5);
    }
}