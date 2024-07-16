// Java Program to demonstrate
// System.in
import java.util.*;
// Driver Class
class In {
    // Main Function
    public static void main(String[] args)
    {
        // Scanner class with System.in
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Printing the output
        System.out.printf("Addition: %d", x + y);
    }
}