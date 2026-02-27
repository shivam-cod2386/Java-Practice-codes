public class Butterfly {
    public static void main(String[] args) {
        int n = 4; // Size of the butterfly (adjust as needed)
        
        // Upper part of butterfly
        for (int i = 1; i <= n; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces for body
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Lower part of butterfly
        for (int i = n; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces for body
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}