package is.hi.voa6.hbv202g.ass4;
import org.apache.commons.numbers.primes.Primes;


/**
 * Next prime
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int frumtala = Primes.nextPrime(123456789);
        System.out.println("Next prime number after 123456789 is:" + frumtala);
    }
}
