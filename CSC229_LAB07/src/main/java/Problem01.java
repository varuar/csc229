import java.util.*;

public class Problem01 {
        public static long getSumOfPrimes(int n){
          // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time            
    boolean[] primes = new boolean[n+1];
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;
    long sum = 0;
    
    for(int i=2; i<=n; i++){
        if(primes[i]){
            sum += i;
            for(int j=2*i; j<=n; j+=i){
                primes[j] = false;
            }
        }
    }
    
    return sum;
}}
//space complexity is O(n) & time complexity is O(n*log(log(n)))

