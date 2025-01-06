import java.util.Scanner;

public class IT24103591Lab10Q1 {
    public static void main(String[] args) {
        // Enable assertions in the JVM by adding -ea flag while running the program.
        
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a mark
        System.out.print("Enter a mark (0 to 100): ");
        int mark = scanner.nextInt();
        
        // Assert that the mark is between 0 and 100 inclusive
        try {
            // Assertion to check if the mark is within valid range
            assert mark >= 0 && mark <= 100 : "Invalid Mark";
            
            // If the assertion passes, print validation message
            System.out.println("Mark is Validated");
        } catch (AssertionError e) {
            // Catch assertion error and print the message
            System.out.println(e.getMessage());
        }
        
        // Close the scanner object
        scanner.close();
    }
}
