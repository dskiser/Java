// Demonstrate a method reference for a static method

// A functional interface for numeric predicates that operate on integer values
interface IntPredicate {
    boolean test(int n);
}

// This class defines three static method shtat check an integer against some condition.
class MyIntPredicates {
    // A static method that returns true if a number is prime.
    static boolean isPrime(int n) {

        if(n < 2) return false;
        for(int i=2; i <= n/i; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // A static method that returns true if a number is even.
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    // A static method that returns true if a number is positive.
    static boolean isPositive(int n) {
        return n >  0;
    }
}

class MethodRefDemo {
    static boolean numTest(IntPredicate p, int v) {
      return p.test(v);
    }
    
    public static void main(String args[]) {
      //Here ,a method reference to isPrime is passed to numTest().
      boolean result;

      result = numTest(MyIntPredicates::isPrime, 17);
        if(result) System.out.println("17 is prime.");

        result = numTest(MyIntPredicates::isEven, 12);
      if(result) System.out.println("12 is even.");

        result = numTest(MyIntPredicates::isPositive, 11);
      if(result) System.out.println("11 is positive.");
    }
}

