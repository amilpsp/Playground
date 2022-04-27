public class CustomClass_Polynomial {
    //No instance fields in ours, not absolutely necessary.    *****LOOK THIS UP LATER*****
    double p, q;    //may be questionable but works for now

    public CustomClass_Polynomial(double coefficient1, double coefficient2){    //constructor method
        p = coefficient1;
        q = coefficient2;
    }

    public double evaluateAt(double x){
        return x * x + p * x + q;
    }

    public double[] computeRoots(){
        final double halfPpow2= Math.pow((p/2),2) ;     //Splitting up the subcomponents of the formula
        final double pqSqrt = Math.sqrt(halfPpow2 - q);

        double[] roots = new double[]{  //We deleted roots 1 & 2 variables from the method because
                -(p/2) + pqSqrt,        // it wasn't necessary to intermediately store them anywhere
                -(p/2) - pqSqrt,        // to return them
        };
        return roots;
    }
}