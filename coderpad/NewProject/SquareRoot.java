package gs.coderpad.NewProject;

public class SquareRoot {

    public static double sqrt(double N, double tolerance) {
        if (N < 0) {
            throw new IllegalArgumentException("Cannot compute the square root of a negative number.");
        }
        if (N == 0) {
            return 0;
        }

        double guess = N; // Initial guess can be N or any positive number
        double previousGuess;

        do {
            previousGuess = guess;
            guess = (guess + N / guess) / 2;
        } while (Math.abs(guess - previousGuess) > tolerance);

        return guess;
    }

    public static void main(String[] args) {
        double N = 625; // Example number
        double tolerance = 1e-10; // Tolerance for convergence

        double result = sqrt(N, tolerance);
        System.out.println("The square root of " + N + " is approximately " + result);
    }
}
