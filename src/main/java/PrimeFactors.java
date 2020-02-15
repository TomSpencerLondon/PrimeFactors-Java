import java.util.ArrayList;

public class PrimeFactors {
  public ArrayList<Integer> of(int n){
    ArrayList<Integer> factors = new ArrayList<Integer>();

    for (int divisor = 2; n > 1; divisor++)
      for (; n % divisor == 0; n /= divisor)
        factors.add(divisor);
    return factors;
  }
}
