import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
   @Test
   public void of_1isNone(){
       PrimeFactors prime = new PrimeFactors();
       ArrayList<Integer> array = new ArrayList<Integer>();
       assertEquals(array, prime.of(1));
   }
    @Test
    public void of_2is2(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        assertEquals(array, prime.of(2));
    }
    @Test
    public void of_3is3(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(3);
        assertEquals(array, prime.of(3));
    }
    @Test
    public void of_4is2_2(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(2);
        assertEquals(array, prime.of(4));
    }
    @Test
    public void of_6is2_3(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(3);
        assertEquals(array, prime.of(6));
    }
    @Test
    public void of_8is2_2_2(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(2);
        array.add(2);
        assertEquals(array, prime.of(8));
    }
    @Test
    public void of_9is3_3(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(3);
        array.add(3);
        assertEquals(array, prime.of(9));
    }
    @Test
    public void of_acceptanceTest(){
        PrimeFactors prime = new PrimeFactors();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(2);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(3);
        array.add(5);
        array.add(7);
        array.add(11);
        assertEquals(array, prime.of(2*2*2*3*3*5*7*11));
    }
}