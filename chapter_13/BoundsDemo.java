class NumericFns<T extends Number> {
    T num;

    NumericFns(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

class BoundsDemo {
    public static void main(String args[]) {
        NumericFns<Integer> iOb =
            new NumericFns<Integer>(5);

        System.out.println("Reciprocal of iOb is " +
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is " +
                iOb.fraction());
    }
}
