import java.util.Scanner;

public class Playground_EvalPoly {
    static double requestXFromUser() {             //The parenthesis refer to the input needed to execute the function
        Scanner scanX = new Scanner(System.in);     //      "Request" in the name instead of "get" because getting
        System.out.print(                           // you can do from a database without involving the user.
                // Request is so much more specific.
                """
                Givet är polynomet: y = x^2 + p * x + q
                Skriv in värden av x, tack:
                """
        );
        double x = scanX.nextDouble();                  //   The linter complains about redundancy, but it's good to
        return x ;                                  //reduce the complexity of the return line to show intention.
    }

    public static void main(String[] args) {
        double p = 3.0;
        double q = 1.0;
        double[] roots;                             //You can declare Arrays just like declaring variables
        CustomClass_Polynomial polynomial = new CustomClass_Polynomial(p, q);

        double x = requestXFromUser();              // Calling the other method in this class.
        double polynomialEvaluatedAtX = polynomial.evaluateAt(x);
                                                    /* Calling the 1st method of the other file,
                                                    inside of the project. */

        System.out.println("Värden av \"y\" är  " + polynomialEvaluatedAtX);

        roots = polynomial.computeRoots();          /* Calling the 2nd method on the other file,
                                                    inside of this project. */

        System.out.println("Rötterna är:");
        System.out.println("    X_1 = " + roots[0]);
        System.out.println("    X_2 = " + roots[1]);

    }
}