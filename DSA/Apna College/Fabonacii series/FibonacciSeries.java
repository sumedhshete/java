public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Change this to the number of Fibonacci terms you want to generate

        // Initialize the first two terms of the Fibonacci series
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("Fibonacci Series (Up to " + n + " terms):");

        // Print the first and second terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        // Calculate and print the remaining terms
        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            // Update the firstTerm and secondTerm for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
